package com.globallogic.app.entities.Excepciones;

// Ejercicio 8.2: A partir de un objeto inicializado en null, ejecute un método de este y capture la excepción
// mostrando en la salida: "Se produjo una excepción. null"

public class SeProdujoNull {

    static String mensaje = null;

    public static void main(String[] args) {

        try {            
            mensaje.charAt(20);            
        } catch(NullPointerException e) {

            System.out.println("Se produjo una excepción. " + e.getMessage());

        }
    }    
}