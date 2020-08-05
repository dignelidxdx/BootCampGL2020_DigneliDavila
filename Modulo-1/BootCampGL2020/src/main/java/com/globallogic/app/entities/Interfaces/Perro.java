package com.globallogic.app.entities.Interfaces;

public class Perro implements Animal {

	public void dormir() {
		
		System.out.println("Zzz...");		
	}

	public void sonidoAnimal() {

		System.out.println("El perro hace guau guau...");	
	}

	public void come(String s) {

		System.out.println("El " + s + " se alimenta");		
	}

	public void camina(String animal) {

		System.out.println("El " + animal + " camina");
	}
        
}