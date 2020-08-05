package test.java.coverage.example.model;

public class PlanetTest {
    
    private Planet planet;
    
    @Test
	 @DisplayName("Agregando nombre a Planeta")
	 public void GetPlanetNameTest() {
		
		planet.setName("Mercurio");		
		
		assertNotNull(planet.getName());		
    }	
    
    @Test
	void WhenToStringThenOK() {
        Planet planet = new Planet();
        
        planet.setName("Jupiter");
        
		assertEquals("Planet [name=Jupiter]", planet.toString());
	}

}