package com.globallogic.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.globallogic.app.entities.*;

/**
 * Ejercicio Introduccion al Desarrollo
 *
 * Ejercicio 4.1 y 4.2 se hicieron aca
 */
public class App 
{
    public static Scanner Teclado = new Scanner (System.in);
    public static ArrayList<Empleado> empleados = new ArrayList();
    public static void main( String[] args )
    {        
     
        System.out.println("Indica cantidad de empleados:");
        int cantidadEmpleados = Teclado.nextInt();
        if(cantidadEmpleados <= 20){
            for (int i = 1; i <= cantidadEmpleados; i++) {
                System.out.println("Introducir DNI del empleado numero: " + i);
                Teclado.nextInt();
                String nuevoDNI = Teclado.nextLine();
                Empleado empleado = new Empleado(nuevoDNI);
                System.out.println("Introducir nombre del empleado:");
                String nombre = Teclado.nextLine();
                empleado.setNombre(nombre);
                System.out.println("Introducir cantidad de hijos:");
                int hijos = Teclado.nextInt();
                empleado.setNumeroDeHijos(hijos);
                System.out.println("Introducir estado civil: (C o S)");
                String estadoCivil = Teclado.nextLine();
                empleado.setNombre(estadoCivil);
                System.out.println("Introducir sueldo base:");
                double sueldoBase = Teclado.nextInt();
                empleado.setSueldoBase(sueldoBase);
                System.out.println("Introducir horas extras:");
                int horasExtras = Teclado.nextInt();
                empleado.setHoraExtrasTrabajada(horasExtras);

                System.out.println("Introducir importe correspondiente a cada hora extra:");
                int importeCorrespondiente = Teclado.nextInt();

                int complemento = empleado.calculoComplemento(importeCorrespondiente, empleado.getHoraExtrasTrabajada());
                empleado.setImporteHoraExtra(complemento);

                empleados.add(empleado);
            }           
        }
        // importe correspondiente al pago por hora extra asignándoselo al atributo estático de la clase.
        System.out.println("Introducir importe correspondiente:");
        double importeCorrespondiente = Teclado.nextInt();




        for (Empleado gestionEmpleados : empleados) {
                System.out.println(gestionEmpleados);
        }        

    }



    public static void MensajeUsuario() {
        System.out.println("Ingrese su pago");
    }
    public static boolean esMayuscula(String s) {
		// Regresa el resultado de comparar la original con su versión mayúscula
		return s.equals(s.toUpperCase());
	}
    public static int suma(int numero, int numeroDos) {

        int suma = numero + numeroDos;

        return suma;
    }
}
