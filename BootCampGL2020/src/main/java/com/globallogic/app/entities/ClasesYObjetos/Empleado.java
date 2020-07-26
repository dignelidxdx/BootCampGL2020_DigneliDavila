package com.globallogic.app.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona {

	public static Scanner Teclado = new Scanner (System.in);
    public static ArrayList<Empleado> empleados = new ArrayList();

    public Empleado(String dNI) {
		this.dNI = dNI;
	}
	public Empleado() {
		
	}

    private String dNI;
    private int idEmpleado;   
    private double sueldoBase; 
    private int horaExtrasTrabajada;
    private double tipoIRPF;
    private static int importeHoraExtra;


	public String getDNI() {
		return dNI;
	}
	public void setDNI(String dNI) {
		this.dNI = dNI;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getHoraExtrasTrabajada() {
		return horaExtrasTrabajada;
	}
	public void setHoraExtrasTrabajada(int horaExtrasTrabajada) {
		this.horaExtrasTrabajada = horaExtrasTrabajada;
	}
	public double getTipoIRPF() {
		return tipoIRPF;
	}
	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}
	public int getImporteHoraExtra() {
		return importeHoraExtra;
	}
	public static void setImporteHoraExtra(int importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
    }
    public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
    }
    	
    public int calculoComplemento(int importeCorrespondiente, int horasExtras) {
		return horasExtras * importeCorrespondiente;
	}

	public static int sueldoBruto(int importeHoraExtra, double sueldoBase) {

		// por revisar
		double pagoCorrespondiente = importeHoraExtra + sueldoBase;
		return (int) pagoCorrespondiente;
	}
    
	public double calculoRetenciones(double sueldoBruto,double retenciones) {
		double retencionesActuales = 0;
        if(super.getEstadoCivil() == "C") {
			retencionesActuales = retenciones - 0.2;
		}
		if(super.getNumeroDeHijos() > 0) {
			for (int i = 1; i <= super.getNumeroDeHijos(); i++) {
				retencionesActuales = retenciones - 0.1;
				retenciones = retencionesActuales;
			}		
		}
		
		double nuevoSueldoBruto = sueldoBruto * ( 1 + retencionesActuales);

        return nuevoSueldoBruto;
    }

    @Override
    public String toString(){	
        return this.getDNI() + " " + this.getNombre() + "\nSueldo Base: " + this.getSueldoBase() + "\nHoras Extras: " + this.getHoraExtrasTrabajada() + "\ntipo IRPF: " + this.getTipoIRPF() + "\nCasado: " + this.getEstadoCivil() + "\nNúmero de Hijos: " + this.getNumeroDeHijos();
	}
	
	Empleado mayorSueldoE = null;
        int maySueldo = 0;

	EmpleadoDemo menorSueldoE = null;
	int menorSueldo = 0;

	public void gestionDelEmpleado() {

		System.out.println("Indica cantidad de empleados:");
        int cantidadEmpleados = Teclado.nextInt();
        if(cantidadEmpleados <= 20){
            for (int i = 1; i <= cantidadEmpleados; i++) {
                System.out.println("Introducir DNI del empleado numero: " + i);
				String nuevoDNI = Teclado.nextLine();
				Teclado.nextLine();
                Empleado empleado = new Empleado(nuevoDNI);
                System.out.println("Introducir nombre del empleado:");
                String nombre = Teclado.nextLine();
                empleado.setNombre(nombre);
                System.out.println("Introducir cantidad de hijos:");
                int hijos = Teclado.nextInt();
                empleado.setNumeroDeHijos(hijos);
                System.out.println("Introducir estado civil: (C o S)");
				String estadoCivil = Teclado.nextLine();
				Teclado.nextLine();
                empleado.setNombre(estadoCivil);
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
               
                empleados.add(empleado);
            }           
        }

         // El empleado que más cobra y el que menos
        for (Empleado e : empleados){
            if (sueldoBruto(getImporteHoraExtra(), getSueldoBase())  > maySueldo)
            {
				maySueldo = e.sueldoBruto(getImporteHoraExtra(), getSueldoBase());
				Empleado empleadoM = new Empleado();				
                mayorSueldoE = e;
            }
		}
		System.out.println("El empleado que más cobra es: " + empleadoM.getNombre());
		
		Empleado menorSueldoE = null;
        int menorSueldo = maySueldo;

        for (Empleado eU : empleados){
            if (sueldoBruto(eU.getImporteHoraExtra(), eU.getSueldoBase()) < menorSueldo)
            {
                menorSueldo = eU.sueldoBruto(eU.getImporteHoraExtra(), eU.getSueldoBase());
                menorSueldoE = eU;

            }
        }

        System.out.println("El empleado que menos cobra es: " + menorSueldoE.getNombre());

		// El empleado que cobra más por horas extra y el que menos.


        // Todos los empleados ordenados por salario de menor a mayor.


        for (Empleado gestionEmpleados : empleados) {
                System.out.println(gestionEmpleados);
        }        

	}
    
}