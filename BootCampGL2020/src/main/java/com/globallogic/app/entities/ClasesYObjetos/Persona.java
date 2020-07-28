package com.globallogic.app.entities.ClasesYObjetos;

public class Persona {

    private String nombre;
    private char estadoCivil;
    private int numeroDeHijos;

    
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getEstadoCivil() {
		return this.estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getNumeroDeHijos() {
		return this.numeroDeHijos;
	}
	public void setNumeroDeHijos(int numeroDeHijos) {
		this.numeroDeHijos = numeroDeHijos;
	}

    
}