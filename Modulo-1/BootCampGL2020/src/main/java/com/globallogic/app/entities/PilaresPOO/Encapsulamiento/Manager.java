package com.globallogic.app.entities.PilaresPOO.Encapsulamiento;

public class Manager {
    
    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.setPatas(4);  
        gato.setNombre("Kobe");

        System.out.println("El gato se llama " + gato.getNombre() + " y tiene " + gato.getPatas() + " patas.");
    }
}