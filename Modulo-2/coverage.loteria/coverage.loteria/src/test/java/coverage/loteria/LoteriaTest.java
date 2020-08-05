package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

import coverage.loteria.model.CartonGenerator;

public class LoteriaTest {
    
    public Loteria loteria;
    private Loteria loteriaDos;
    private CartonGenerator carton;

    @BeforeAll
	static void beforeAll(){
		System.out.println("Antes de todos los Test");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Despues de todos los test");	
    }	
    
    @BeforeEach
	void setUp() {
		loteria = new Loteria(1240, 1, carton);
		loteriaDos = new Loteria(1240, 4, carton);
		carton = new CartonGenerator();
		
    }
    
    @Test
    @DisplayName("Hay un ganador unico")
	public void LoteriaGanadorUnicoTest() {
		
		loteria.setGanadores(1);
		boolean expected = loteria.hayGanadorUnico();

		assertTrue(expected, "Es Ganador");
		
	}

	@Test
    @DisplayName("Hay varios ganadores")
	public void LoteriaGanadorVariosTest() {

		loteriaDos.setGanadores(4);
		boolean expected = loteriaDos.hayCuadrupleGanador();

		assertTrue(expected, "Es Ganador 4 personas");
		
	}
	
    @Test
    @DisplayName("No hay ganador")
	public void LoteriaGanadorUnicoPerdioTest() {
		
		loteria.setGanadores(3);
		boolean expected = loteria.hayGanadorUnico();

		assertFalse(expected, "No es Ganador");
		
	}

	@Test
    @DisplayName("No hay ganadores")
	public void LoteriaGanadorVariosPerdioTest() {

		loteriaDos.setGanadores(7);
		boolean expected = loteriaDos.hayCuadrupleGanador();

		assertFalse(expected, "No es Ganador: 4 personas");
		
	}
	
	@Test
    @DisplayName("Usando metodo obtener ganadores")
	public void LoteriaObtenerGanadoresTest() {

		loteriaDos.setGanadores(10);

		assertNotNull(loteriaDos.getGanadores(), "Hay un objeto ganador");
		
	}
	
	@Test
    @DisplayName("Verificando que haya objeto")
	public void loteriaObjetoCompletoTest() {

		loteriaDos = new Loteria(100, 100, carton);

		assertNotNull(loteriaDos, "Hay un objeto ganador");
		
	}
	
	@Test
    @DisplayName("Usando atributos de Loteria pozo y boletos")
	public void loteriaObjetoTest() {

		loteriaDos = new Loteria(100, 100, carton);

		assertNotNull(loteriaDos.getPozo());
		assertNotNull(loteriaDos.getBoletos());		
	}
	
	@Test
    @DisplayName("Es ganador? usando metodo")
	public void CartonIsGanadorTest() {

		boolean ganador = carton.isGanador();

		assertTrue(ganador);
		
	}
	
	@Test
    public void getGanadores() {
		Loteria loteria = new Loteria(20000, 1000, carton);  
        loteria.jugada();
        assertNotNull(loteria);
	}
	
	@Test
	void WhenJugadaThen() {
		Loteria loteria = new Loteria(100, 1000, new CartonGenerator());
		
		assertFalse(loteria.hayGanadorUnico());   // No hay ganadores por que no se jugo
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(1000,loteria.getBoletos()); // Hay un total de 1000 boletos disponibles a jugarse
		assertEquals(100,loteria.getPozo());
		assertEquals(0,loteria.getGanadores());
		loteria.jugada();	

		// Es poco probable que haya ganadores
		assertEquals(0,loteria.getGanadores());
		assertFalse(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(0,loteria.getBoletos()); 
		assertEquals(100,loteria.getPozo());
	}
    

}