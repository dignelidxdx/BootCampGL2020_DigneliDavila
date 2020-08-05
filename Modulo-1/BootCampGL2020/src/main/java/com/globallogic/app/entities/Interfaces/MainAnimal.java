package com.globallogic.app.entities.Interfaces;

public class MainAnimal {
    
    public static void main(String[] args) {

       Perro dog = new Perro();

        dog.dormir();
        dog.sonidoAnimal();
        dog.come("perro");
        dog.camina("perro");

    }
}