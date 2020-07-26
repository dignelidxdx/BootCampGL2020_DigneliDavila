package com.globallogic.app.entities.ControlFlujoForEach;

import java.util.ArrayList;

/* Ejercicio 4.10: Crear un array string con todos los días de la semana ("Lunes", "Martes",
"Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"), recorrer ese array con un For
each e imprimir cada uno de los valores.
Ejemplo salida:
Dia de la semana: Lunes
Dia de la semana: Martes */

public class DiaDeLaSemana {  

    public static void main( String[] args ){

        ArrayList<String> valores = new ArrayList<String>();

        valores.add("Lunes");
        valores.add("Martes");
        valores.add("Miercoles");
        valores.add("Jueves");
        valores.add("Viernes");
        valores.add("Sabado");
        valores.add("Domingo");       

        for (String dias : valores) {
                System.out.println("Dia de la semana: " + dias);
        }    
    }

    // Output: Dia de la semana: Lunes
    // Dia de la semana: Martes
    // Dia de la semana: Miercoles
    // Dia de la semana: Jueves...
}