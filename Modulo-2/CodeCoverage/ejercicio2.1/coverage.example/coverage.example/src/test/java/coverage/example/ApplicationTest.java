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
	
	
	private Application app;
	
	@Test
	void WhenMainExecutesThenOk() {
		Application.main(null);
	}

	@Test
	void WhenApplicationInstancesThenOk() {
		Application app = new Application();
		assertNotNull(app);
	}

	
	@ParameterizedTest
	@MethodSource("star")
	void isNullTest(Star star) {
		System.out.println("---------ISNULL------------");
		System.out.println("Nombre: " + star.getName());
		assertNotNull(star);
	}  


	private static Star star() {
		Star starNew = new Star();
		Planet planet = new Planet();
		Galaxy galaxy = new Galaxy("Hola");
		starNew.setColor("Blanco");
		starNew.setName("Perlita");
		planet.setName("Saturno");
		 System.out.println(galaxy.name);
		ArrayList<Planet> planets = new ArrayList();
		planets.add(planet);
		starNew.setPlanets(planets);
		Application app = new Application();
		 System.out.println(app);
		 System.out.println(starNew.getPlanets());
		 System.out.println(planet.getName());
		 System.out.println(starNew.getName());
		 System.out.println(starNew.getColor());
		return starNew;
	}


}
