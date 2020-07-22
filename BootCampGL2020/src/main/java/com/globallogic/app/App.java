package com.globallogic.app;

import java.util.Scanner;

import com.globallogic.app.entities.*;

/**
 * Ejercicio Introduccion al Desarrollo
 *
 */
public class App 
{
    public static Scanner Teclado = new Scanner (System.in);
    public static void main( String[] args )
    {        
        CicloFor ciclo = new CicloFor();        
      
        ciclo.main();

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
