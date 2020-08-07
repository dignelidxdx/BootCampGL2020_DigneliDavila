package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	// 1.1
	@Test
	void test() {

	assertEquals("Test", "Test"); 
	
	}
	
	// 1.2
	@Test
    void LetrasTest() {
        String palabraA = "Manzana";
        String palabraB = "Manzana";
        String PalabraC = "Pera";
        // assertEquals(palabraA, palabraB);
        assertNotEquals(palabraB, PalabraC);

    }

	// 1.3
    @Test
    void NumerosTest() {
        boolean valorVerdadero = 25>12;
        boolean valorFalso = 25>27;
        assertTrue(valorVerdadero , " Es verdadero ");
        //  assertFalse(valorFalso, " Es falso ");
    }

    // 1.4
    @Test
    void VariableLongTest() {
        Long nombreLong = null;
        nombreLong = (long) 1;
        assertNotNull(nombreLong);
        
    }
    	
    // 1.5
    
    // 1.6 
   
    @Test
    void NumerosSumaTest() {
        App app = new App();

        int sumaResult = app.suma(2, 3);
        int esperado = 5;
        // assertEquals(esperado, sumaResult);
        esperado = 6;
        assertNotEquals("El resultado esta mal: " + sumaResult, esperado);
    }
    
    // 1.7
    @Test 
    void EjercicioSieteTest() {
        App app = new App();
        
        boolean resultado = app.Ejercicio(3);
        boolean valorEsperado = true;
    	assertEquals(valorEsperado, resultado);
    }


	
}