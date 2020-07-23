package com.globallogic.app.entities;

public class Electrodomestico {

    String marca;
    double peso;
    char consumo;
    String color;

    public void encender() {
        System.out.println("Encendiendo electrodoméstico");
    }

    public void apagar() {
        System.out.println("Apagando electrodoméstico");
    }
    
}