package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
public class LoteriaTest {
    
  	@Test
	void WhenJugadaThen() {
		Loteria loteria = new Loteria(100, 1000, new CartonGenerator());
		 // No hay ganadores por que no se jugo
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(1000,loteria.getBoletos()); 
		assertEquals(100,loteria.getPozo());
		assertEquals(0,loteria.getGanadores());
		loteria.jugada();	

		assertEquals(0,loteria.getGanadores());
		assertFalse(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(0,loteria.getBoletos()); 
		assertEquals(100,loteria.getPozo());
	}

	@Mock
	CartonGenerator cartonGeneratorMock;
	
	@Test
	void WhenJugadaPreparadaThenOK() {
		
		Mockito.when(cartonGeneratorMock.isGanador()).thenReturn(true,false);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorMock);
		loteria.jugada();
		
		assertTrue(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
	}
	
	@InjectMocks
	CartonGenerator cartonGeneratorInjectMock;
	
	@Mock
	Random rand;
	
	@Test
	void WhenJugadaExcepcionalThenOK() {
		
		
		Mockito.when(rand.nextInt()).thenReturn(1,1,1,1,0);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorInjectMock);
		loteria.jugada();
		
		assertFalse(loteria.hayGanadorUnico());   
		assertTrue(loteria.hayCuadrupleGanador()); 
	}	

}