package com.globallogic.app.entities;

public class Electrodomestico {

    public String marca;
    public double peso;
    public char consumo;
    public String color;

    public void encender() {
        System.out.println("Encendiendo electrodoméstico");
    }

    public void apagar() {
        System.out.println("Apagando electrodoméstico");
    }

    public String toString() {
        return "Color: " + this.color + " Marca: " + this.marca;
    }
    
}