package com.globallogic.app.entities.Excepciones;

// Ejercicio 8.3: Escriba código para generar y capturar la excepción ArrayIndexOutOfBoundsException
// (Índice de matriz fuera de límites) mostrando en la consola "Excepción: índice de array fuera de límites"

public class ArraySinLimites {

    public static void main(String[] args) {

        try {
            String frutas [] = new String[2]; 
            frutas[1] = "manzana";
            frutas[2] = "pera";
            frutas[3] = "durazno";

            System.out.println(frutas);
        } catch(ArrayIndexOutOfBoundsException e) {
    
            System.out.println("Excepción: índice de array fuera de límites " + e.getMessage());
        }


    }

}