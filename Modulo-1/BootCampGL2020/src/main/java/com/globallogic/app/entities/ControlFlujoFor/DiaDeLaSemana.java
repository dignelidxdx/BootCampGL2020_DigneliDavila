package com.globallogic.app.entities.ControlFlujoFor;

/*Ejercicio 4.6: Crear un array string con todos los días de la semana ("Lunes", "Martes",
"Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"), recorrer ese array con un For e
imprimir cada uno de los valores.
Ejemplo salida:
Dia de la semana: Lunes
Dia de la semana: Martes... */

public class DiaDeLaSemana {   
    
    public static void main( String[] args ) {

        String diasSemanales[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        for (int i = 0; i < diasSemanales.length; i++) {
              System.out.println("Dia de la semana: " + diasSemanales[i]);  
        }
    }

    /*
    Input:
    Output:  Dia de la semana: Lunes
    Dia de la semana: Martes
    Dia de la semana: Miercoles
    Dia de la semana: Jueves
    Dia de la semana: Viernes
    Dia de la semana: Sabado
    Dia de la semana: Domingo */
}