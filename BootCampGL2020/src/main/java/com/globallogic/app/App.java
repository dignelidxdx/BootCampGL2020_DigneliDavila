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
        EmpleadoDemo empleadoDemo = new EmpleadoDemo();
        empleadoDemo.main();

        VariableInstancia vI = new VariableInstancia();
        vI.engPoints = 50;
        vI.mathsPoints = 80;

        System.out.println("El valor de entProing es: " + vI.engPoints + " y el valor de mathsPoints es: " + vI.mathsPoints);
      
    }
    public static void MensajeUsuario() {
        System.out.println("Ingrese un numero");
    }
}
