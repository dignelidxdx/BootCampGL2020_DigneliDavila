package com.globallogic.app.entities.ControlFlujoIF;
import java.util.Scanner;

/*Ejercicio 4.2: Dado los siguientes valores de entrada “A” y “b”, determinar si una letra es mayúscula o no.
Imprimir "Es una letra mayuscula" en el caso de ser mayúscula.
Imprimir "No es una letra mayuscula" en el caso de ser minúscula.*/

public class LetraMayuscula {


    public static Scanner Teclado = new Scanner (System.in);
    public static void main( String[] args ) {        
        
        MensajeUsuario();
        String letraUno = Teclado.nextLine();
        String letraDos = Teclado.nextLine();

        if(esMayuscula(letraUno) || esMayuscula(letraDos)) {
            System.out.println("Es una letra mayuscula");
        } else System.out.println("No es letra mayuscula");


    }

    public static boolean esMayuscula(String s) {
		// Regresa el resultado de comparar la original con su versión mayúscula
		return s.equals(s.toUpperCase());
	}

    public static void MensajeUsuario() {
        System.out.println("Ingrese dos letras");
    }	   


    // Input: A y b
    // Output: Es una letra mayuscula

}