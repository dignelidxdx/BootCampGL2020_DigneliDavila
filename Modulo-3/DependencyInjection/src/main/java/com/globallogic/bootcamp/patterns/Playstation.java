package com.globallogic.bootcamp.patterns;

public class Playstation {

	 private Game videogame;

    public Playstation(Game game) {
        this.videogame = game;
    }

    public void Playstation(Game videogame) {
        this.videogame = videogame;
    }

    public Game getVideogame() {
        return this.videogame;
    }

    public void setVideogame(Game videogame) {
        this.videogame = videogame;
    }
    
    public void askMyGame() {
        if(getVideogame() == null) {
            System.out.println("Estoy vacio!");
        } else System.out.println("El videojuego que estoy corriendo es: " + getVideogame());      
        

    }
    
    @Override
	  public String toString() {
	    return " Title: " + this.videogame;
	  }
    
}