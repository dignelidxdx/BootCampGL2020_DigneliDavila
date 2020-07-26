package com.globallogic.app.entities.ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaManager {
    
    public static Scanner Teclado = new Scanner (System.in);

    public static ArrayList<Empleado> empleados = new ArrayList();
    static Empleado empleadoMayor = new Empleado();
    static Empleado empleadoMenor = new Empleado();
    static Empleado empleadoMasHorasExtras = new Empleado();
    static Empleado empleadoMenosHorasExtras = new Empleado();


    public static void main( String[] args ){  
     
        PersonaManager manager = new PersonaManager();
        ArrayList<Empleado> empleadosOrdenados = gestionEmpleado();

        for (Object emp : empleadosOrdenados) {
            System.out.println(emp);
        }
        // El empleado que más cobra y el que menos
        manager.empleadoQueMasCobra(empleadosOrdenados);
        manager.empleadoQueMenosCobra(empleadosOrdenados);

        // El empleado que cobra más por horas extra y el que menos.
        manager.masCobraHoraExtra(empleadosOrdenados);
        manager.menosCobraHoraExtra(empleadosOrdenados);

        // Todos los empleados ordenados por salario de menor a mayor.

        empleadosOrdenados.sort((e1, e2) -> Double.compare(((Empleado) e1).getSueldoBase(), ((Empleado) e2).getSueldoBase()));
      
        for (Empleado empleado : empleadosOrdenados) {
            System.out.println(empleado.getSueldoBase());
        }
    }

    public static ArrayList<Empleado> gestionEmpleado() {

        // El número total de empleados se pide por teclado.
        mensajeUsuario();
        int cantidadEmpleados = Teclado.nextInt(); 
        // El número máximo de empleados es de 20.
        if(cantidadEmpleados <= 20 && cantidadEmpleados > 0){

            for (int i = 1; i <= cantidadEmpleados; i++) {

                System.out.println("Introducir DNI del empleado numero: " + i);
                String nuevoDNI = Teclado.nextLine();
                nuevoDNI = Teclado.nextLine();
                Empleado empleado = new Empleado(nuevoDNI);
                System.out.println("Introducir nombre del empleado:");
                String nombre = Teclado.nextLine();
                empleado.setNombre(nombre);
                System.out.println("Introducir cantidad de hijos:");
                int hijos = Teclado.nextInt();
                empleado.setNumeroDeHijos(hijos);
                System.out.println("Introducir estado civil: (C o S)");
                String estadoCivil = Teclado.nextLine();
                estadoCivil = Teclado.nextLine();
                empleado.setEstadoCivil(estadoCivil);
                System.out.println("Introducir sueldo base:");
                double sueldoUBase = Teclado.nextInt();
                empleado.setSueldoBase(sueldoUBase);
                System.out.println("Introducir horas extras:");
                int horasExtras = Teclado.nextInt();
                empleado.setHoraExtrasTrabajada(horasExtras);

                // importe correspondiente al pago por hora extra asignándoselo al atributo estático de la clase.
                System.out.println("Introducir importe correspondiente por cada hora extra:");
                int importeCorrespondiente = Teclado.nextInt();

                int complemento = empleado.calculoComplemento(importeCorrespondiente, empleado.getHoraExtrasTrabajada());
                empleado.setImporteHoraExtra(complemento);

                System.out.println("Para calcular retenciones introduzca el IRPF para calcular sobre sueldo bruto");
                double retenciones = Teclado.nextDouble();
                double calculoRetenciones = empleado.calculoRetenciones(retenciones);
                empleado.setTipoIRPF(calculoRetenciones);
                
                
                empleados.add(empleado);
            }    
        } else if(cantidadEmpleados == 0) {
            System.out.println("Tiene que haber número de empleados, no puede ser 0");
            gestionEmpleado();
        } else {
            System.out.println("No puede ser mayor de 20 empleados");
            gestionEmpleado();
        }

        return empleados;
  
    }

    public void empleadoQueMasCobra(ArrayList<Empleado> empleados){
        // El empleado que más cobra

        int maySueldo = 0;    

        for (Empleado e : empleados){
            if (e.sueldoBruto(e.getImporteHoraExtra(), e.getSueldoBase())  > maySueldo)
            {
                maySueldo = e.sueldoBruto(e.getImporteHoraExtra(), e.getSueldoBase());               
                empleadoMayor = e; 
            }    
        }	
        System.out.println("El empleado que más cobra es: " + empleadoMayor.getNombre());			
    }

    public void empleadoQueMenosCobra(ArrayList<Empleado> empleados) {

        // El empleado que menos cobra

        int menorSueldo = 1000000000;

        for (Empleado eU : empleados){
            if (eU.sueldoBruto(eU.getImporteHoraExtra(), eU.getSueldoBase()) < menorSueldo)
            {
                menorSueldo = eU.sueldoBruto(eU.getImporteHoraExtra(), eU.getSueldoBase());                
                empleadoMenor = eU;	                
            }
        }
		System.out.println("El empleado que menos cobra es: " + empleadoMenor.getNombre());
    }

    public void masCobraHoraExtra(ArrayList<Empleado> empleados){
        // El empleado que más cobra

        int cobraMas = 0;    

        for (Empleado e : empleados){
            if (e.getImporteHoraExtra()  > cobraMas)
            {
                cobraMas = e.getImporteHoraExtra();               
                empleadoMasHorasExtras = e; 
            }    
        }	
        System.out.println("El empleado que más cobra importe horas extras es: " + empleadoMasHorasExtras.getNombre());			
    }

    public void menosCobraHoraExtra(ArrayList<Empleado> empleados) {

        // El empleado que menos cobra

        int menorSueldo = 1000000000;

        for (Empleado eU : empleados){
            if (eU.getImporteHoraExtra() < menorSueldo)
            {
                menorSueldo = eU.getImporteHoraExtra();                
                empleadoMenosHorasExtras = eU;	                
            }
        }
		System.out.println("El empleado que menos cobra importe horas extras es: " + empleadoMenosHorasExtras.getNombre());
    }

    public static void mensajeUsuario(){
        System.out.println("Indica cantidad de empleados para gestionar:");
        
    }

}