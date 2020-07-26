package com.globallogic.app.entities.PilaresPOO.HerenciaYPolimorfismo;

public class Electrodomestico {

    private String marca;
    private double peso;
    private char consumo;
    private String color;    

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getConsumo() {
		return this.consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
    }
    
    public void encender() {
        System.out.println("Encendiendo electrodoméstico");
    }

    public void apagar() {
        System.out.println("Apagando electrodoméstico");
    }

    public String toString() {
        return "Color: " + this.getColor() + "\nMarca: " + this.getMarca() + "\nConsumo: " + this.getConsumo() + "\nPeso: " + this.getPeso();
    }
 
}