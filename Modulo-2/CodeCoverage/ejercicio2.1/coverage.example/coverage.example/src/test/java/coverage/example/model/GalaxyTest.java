package test.java.coverage.example.model;

public class GalaxyTest {
    
    @Test
	public void setUp() {
		Galaxy galaxy = new Galaxy("Sagitario");
		
		assertNotNull(galaxy);
    }
}