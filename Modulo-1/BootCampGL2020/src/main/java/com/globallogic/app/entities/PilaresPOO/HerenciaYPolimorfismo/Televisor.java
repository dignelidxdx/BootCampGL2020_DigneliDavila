package com.globallogic.app.entities.PilaresPOO.HerenciaYPolimorfismo;

public class Televisor extends Electrodomestico {
    
    private double pulgadas;
    private String resolucion;   

	public double getPulgadas() {
		return this.pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
    }
    
    public void cambiar(int num){
    }

    @Override
    public void encender() {
        System.out.println("Televisor encenciendo...");
    }
}