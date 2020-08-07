package com.globallogic.bootcamp.patterns;
 
public class AppPatterns 
{
    public static void main( String[] args )
    {
    	 Playstation pS = new Playstation(new Game("Resident Evil"));
         pS.askMyGame();
         pS.setVideogame(new Game("Brawlhalla"));
         pS.askMyGame();
         pS.setVideogame(null);
         pS.askMyGame();
    }
}
