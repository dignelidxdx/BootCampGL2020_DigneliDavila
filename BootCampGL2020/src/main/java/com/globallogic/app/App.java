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
    public static void main( String[] args )
    {        
        Berlina berlina = new Berlina();

        berlina.avanzar();       
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
