package com.globallogic.app;

import java.util.Scanner;

import com.globallogic.app.entities.EmpleadoDemo;
import com.globallogic.app.entities.StudentDetails;
import com.globallogic.app.entities.VariableInstancia;
/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner Teclado = new Scanner (System.in);
    public static void main( String[] args )
    {        
        
        MensajeUsuario();
        String letraUno = Teclado.nextLine();
        String letraDos = Teclado.nextLine();
       
        if(esMayuscula(letraUno) || esMayuscula(letraDos)) {
            System.out.println("Es una letra mayuscula");
        } else System.out.println("No es letra mayuscula");
        

    }
    public static void MensajeUsuario() {
        System.out.println("Ingrese dos letras");
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
