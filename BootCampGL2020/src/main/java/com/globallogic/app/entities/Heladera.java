package com.globallogic.app.entities;

public class Heladera extends Electrodomestico {
    
    public double capacidad;
    public boolean tieneFreezer;
    public double capacidadFreezer;

    public String guardarElemento(){
        System.out.println("Guardando elemento");
        String cosa = "manzana";
        return cosa;
    }
    public String extraerElemento(){
        System.out.println("Extrayendo elemento");
        String cosa = "manzana";
        return cosa;
    }

}