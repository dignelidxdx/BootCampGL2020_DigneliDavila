package com.globallogic.app.entities.ControlFlujoForEach;

/* Ejercicio 4.11: Iterar con un For each el string “BootCamp 2020” e imprimir cada carácter.
Ejemplo salida:
Letra: B
Letra: o
Letra: o */

public class BootcampLetraPorLetra {    

    public static void main( String[] args ){

        String titulo = "BootCamp 2020";

        for (char letra : titulo.toCharArray()) {

                System.out.println("Letra: " + letra);          
                
        }  
    }
}