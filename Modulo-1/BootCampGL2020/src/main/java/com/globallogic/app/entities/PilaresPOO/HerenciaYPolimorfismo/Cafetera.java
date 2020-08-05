package com.globallogic.app.entities.PilaresPOO.HerenciaYPolimorfismo;

public class Cafetera extends Electrodomestico {

       
    private double litros;

    public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

    public void elegirSabor(String sabor){
        System.out.println("El sabor elegido fue: " + sabor);
    }

    @Override
    public void encender() {
        System.out.println("Cafetera encenciendo...");
    }

	
    
}