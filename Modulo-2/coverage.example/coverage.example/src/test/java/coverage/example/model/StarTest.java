package test.java.coverage.example.model;

public class StarTest {
 
    String name = "perlita";

    @Test
    public void StarsOnGalaxy() {
       Star star = new Star();
       Galaxy galaxy = new Galaxy();
       star.setColor("blanco");
       star.setName("perlita");

       galaxy.stars.add(star);
       
       assertEquals(name, start.getName);		
   }

   @Test
	void WhenHandlesNameThenOK() {
		Star star = new Star();
		star.setName("Rigel");
		assertEquals("Rigel",star.getName());
	}
	
	@Test
	void WhenHandlesColorThenOK() {
		Star star = new Star();
		assertNull(star.getColor());
	}

	@Test
	void WhenHandlesPlanetsThenOK() {
		Star star = new Star();
		star.setPlanets(new ArrayList<Planet>());
		assertNotNull(star.getPlanets());
		assertEquals(0, star.getPlanets().size());
	}

	@Test
	void WhenToStringThenOK() {
		Star star = new Star();
		star.setName("Rigel");
		star.setPlanets(new ArrayList<Planet>());
		assertEquals("Star [name=Rigel, planets=[]]", star.toString());
	}


}