package com.globallogic.app;

import java.util.Scanner;

import com.globallogic.app.entities.StudentDetails;
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
        int numero = Teclado.nextInt();
        StudentDetails estudiante = new StudentDetails();
        estudiante.studentAge(numero);       

    }
    public static void MensajeUsuario() {
        System.out.println("Ingrese un numero");
    }
}
