package com.globallogic.app.entities.Interfaces;

public class Hombre implements Animal, Persona {

	public void hablar() {
        
        System.out.println("Las personas hablan mucho");		
	}

	public void dormir() {
        
        System.out.println("El hombre duerme muchas horas");		
	}

	public void sonidoAnimal() {

		System.out.println("El hombre no hace sonido de animal");
	}

	public void come(String s) {

        System.out.println(s + " esta comiendo");		
	}

	public void camina(String nombre) {

		System.out.println(nombre + " esta caminando");			
    }

    public void come() {

		System.out.println("El hombre esta comiendo");		
    }
    
    public static void main(String[] args) {

        Hombre hombre = new Hombre();

        hombre.dormir();
        hombre.hablar();
        hombre.sonidoAnimal();

     }    
}