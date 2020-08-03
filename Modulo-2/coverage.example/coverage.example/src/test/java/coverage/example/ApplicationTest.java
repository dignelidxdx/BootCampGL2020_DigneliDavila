package coverage.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.junit.jupiter.api.*;

import coverage.example.model.Galaxy;
import coverage.example.model.Planet;
import coverage.example.model.Star;

class ApplicationTest {
	
	

	
	private static final String name = "Diana";
	private Galaxy galaxy;
	private Planet planet;
	private Star star;
	
	private Application application;
	
	@Before
	public void setUp() {
		galaxy = new Galaxy(name);
	}
	
		
	 @Test
	 @DisplayName("Probando nombres parecidos")
	 public void StarsOnGalaxy() {
		
		star.setColor("blanco");
		star.setName("perlita");

		galaxy.stars.add(star);
		
		assertEquals(name, galaxy.name);		
	}

}
