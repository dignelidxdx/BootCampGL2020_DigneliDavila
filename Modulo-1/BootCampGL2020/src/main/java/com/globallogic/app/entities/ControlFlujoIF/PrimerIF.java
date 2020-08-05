package com.globallogic.app.entities.ControlFlujoIF;

import java.util.Scanner;

public class PrimerIF {


    public static Scanner Teclado = new Scanner (System.in);
    public static void main( String[] args ) {        
        
        MensajeUsuario();

        int numeroA = Teclado.nextInt();
        int numeroB = Teclado.nextInt();
        int suma = suma(numeroA, numeroB);


        if(suma <= 10) {

            System.out.println("La suma de los numeros es: " + suma);
            
        } else System.out.println("La suma de los numeros fue Mayor a 10");

    }

    public static void MensajeUsuario() {	  
        System.out.println("Ingrese dos numeros");
    }

    public static int suma(int numero, int numeroDos) {

        int suma = numero + numeroDos;

        return suma;
    }	

    // Input: 3 y 5
    // Output: La suma de los numeros es: 8

}