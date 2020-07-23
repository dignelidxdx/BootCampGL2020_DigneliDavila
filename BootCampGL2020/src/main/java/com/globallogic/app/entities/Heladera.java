package com.globallogic.app.entities;

public class Heladera extends Electrodomestico {
    
    public double capacidad;
    public boolean tieneFreezer;
    public double capacidadFreezer;

    public void guardarElementos(String elemento){
        System.out.println("guardando elemento");
    }
    public void extraerElemento(String elemento){
        System.out.println("extrayendo elemento");
    }
    @Override
    public void encender(){
        System.out.println("desde la heladera");
    }

}