package com.globallogic.app.entities.Excepciones;

/*Ejercicio 8.1:
Crear una clase con un método main()
Generar un objeto de la clase Exception dentro de un bloque try.
Proporcionar al constructor de Exception un argumento String.
Capturar la excepción dentro de una cláusula catch e imprimir el argumento String.
Añadir una cláusula finally e imprima el mensaje "Esto se ejecuta sin importar si se
presentan errores" para demostrar que pasó por allí.*/

public class Main {

    
    public static void main(String[] args) {

        try {

            throw new Exception("Esto es una Excepción");

        } catch(Exception exception) {

            System.out.println("Se produjo un excepcion: " + exception.getMessage());

        } finally {
            System.out.println("Esto se ejecuta sin importar si se presentan errores");
        } 

     }


    //  OutPut: Se produjo una excepción: Esto es una Excepción
    // Esto se ejecuta sin importar si se presentan errores
    
}