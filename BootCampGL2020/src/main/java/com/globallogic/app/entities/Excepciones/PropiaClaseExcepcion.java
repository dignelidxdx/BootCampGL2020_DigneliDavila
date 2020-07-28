package com.globallogic.app.entities.Excepciones;

public class PropiaClaseExcepcion {

    public static void main(String[] args) {

        try {
        
        throw new MiExcepcion(" y mi propia Excepción");
        
        } catch (MiExcepcion e) {            
            System.out.println("excepción: " +
            e.getMensaje());
        }
    }
}