package com.globallogic.bootcamp.patterns;

public class Game {

 	private String title;
    
    public Game(String title) {
        this.title = title;
    }

    public Game() {
        
    }
    
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    

	@Override
	  public String toString() {
	    return " Title: " + this.getTitle();
	  }
    
}