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
        int numeroA = Teclado.nextInt();
        int numeroB = Teclado.nextInt();
        int suma = suma(numeroA, numeroB);

        if(suma > 10) {
            System.out.println("La suma de los numeros es Mayor a 10, resultado: " + suma);
        } else System.out.println("La suma fue menor a 10");
        

    }
    public static void MensajeUsuario() {
        System.out.println("Ingrese dos numeros");
    }
    public static int suma(int numero, int numeroDos) {

        int suma = numero + numeroDos;

        return suma;
    }
}
