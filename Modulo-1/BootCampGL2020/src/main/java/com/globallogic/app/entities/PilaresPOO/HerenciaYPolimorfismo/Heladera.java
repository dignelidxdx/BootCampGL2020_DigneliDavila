package com.globallogic.app.entities.PilaresPOO.HerenciaYPolimorfismo;

public class Heladera extends Electrodomestico {
    
    private double capacidad;
    private boolean tieneFreezer;
    private double capacidadFreezer;
 
    public double getCapacidad() {
		return this.capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isTieneFreezer() {
		return this.tieneFreezer;
	}
	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}
	public double getCapacidadFreezer() {
		return this.capacidadFreezer;
	}
	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
    }
    
    public void guardarElementos(String elemento){
        System.out.println("guardando elemento");
    }
    public void extraerElemento(String elemento){
        System.out.println("extrayendo elemento");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo desde la heladera");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando desde la heladera");
    }


}