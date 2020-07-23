package com.globallogic.app.entities;

public class Televisor extends Electrodomestico {
    
    public double pulgadas;
    public String resolucion;

    public void cambiar(int num){

    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Televisor encenciendo");
    }
}