package com.globallogic.app.entities;

public class Cafetera extends Electrodomestico {

       
    public double litros;

    public void elegirSabor(String sabor){

    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Cafetera encenciendo");
    }
    
}