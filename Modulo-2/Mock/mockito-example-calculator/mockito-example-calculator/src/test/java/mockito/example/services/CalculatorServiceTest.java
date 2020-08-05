/**
 * 
 */
package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.configuration.injection.MockInjection;
import org.mockito.internal.creation.bytebuddy.MockAccess;

import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockInjection.class)
public class CalculatorServiceTest {
	
	@Mock
	private BasicOperationsService basicOpSer;
	
	@Mock
	private DataService dataService;
	
	@BeforeEach
	 void setUp() {
		
		((Object) when(dataService.getListOfNumbers())).thenReturn(1, 2, 3, 4, 5);
		
	}

	private Object when(int[] listOfNumbers) {
		
		return null;
	}
	

	@InjectMocks
	CalculatorServiceImpl calServImpl = new CalculatorServiceImpl();
	
	
	@Test
	void SumaCalTest() {
		assertEquals(12.0,calServImpl.calculateSum(7, 5));
	}
	
	@Test
	void RestaCalTest() {
		double results = calServImpl.calculateSubstraction(5,3);
		assertEquals(2.0, results);
	}
	
	@Test
	void DivCalTest() {
		double results = calServImpl.calculateDivision(4, 2);
		assertEquals(2.0, results);
	}
	
	@Test
	void MultaCalTest() {
		double results = calServImpl.calculateMultiplication(2, 2);
		assertEquals(4.0, results);
	}


	@InjectMocks
	private CalculatorServiceImpl calculatorService;


	@Mock
	private BasicOperationsService basicOperationsService;


	@DisplayName("Ejercicio 3.3 - Suma")	
	@Test
	void testCalculateSum() {
		when(basicOperationsService.add(4, 2)).thenReturn(6.0);		
		assertEquals(6.0, calculatorService.calculateSum(4, 2), .01);
		
		verify(basicOperationsService).add(4,2);
	}
	
	@DisplayName("Ejercicio 3.3 - Resta")
	@Test
	void testCalculateSubstraction() {
		when(basicOperationsService.subtract(4, 2)).thenReturn(2.0);		
		assertEquals(2.0, calculatorService.calculateSubstraction(4, 2), .01);
		
		verify(basicOperationsService).subtract(4,2);
	}
	
	@DisplayName("Ejercicio 3.3 - División")
	@Test
	void testCalculateDivision() throws ZeroDivisionException { //Se debe agregar el throws (o try/catch) luego de hacer el ejercicio 3.6
		when(basicOperationsService.divide(4, 2)).thenReturn(2.0);		
		assertEquals(2.0, calculatorService.calculateDivision(4, 2), .01);
		
		verify(basicOperationsService).divide(4,2);
	}
	
	@DisplayName("Ejercicio 3.3 - Multiplicación")
	@Test
	void testCalculateMultiplication() {
		when(basicOperationsService.multiply(4, 2)).thenReturn(8.0);		
		assertEquals(8.0, calculatorService.calculateMultiplication(4, 2), .01);
		
		verify(basicOperationsService).multiply(4,2);
	}
	
	@DisplayName("Ejercicio 3.4")	
	@Test
	void testCalculateAverage() {
		//Inicialmente es:
		//when(dataService.getListOfNumbers()).thenReturn(new int[] { 1, 2, 3, 4, 5 });
		when(dataService.getListOfNumbers()).thenReturn(listaNumeros);
		assertEquals(3.0, calculatorService.calculateAverage(), .01);
	}
	
	@DisplayName("Ejercicio 3.5")
	@Test
	void WhenListIsNullThenNullPointerException() {
		when(dataService.getListOfNumbers()).thenReturn(null);
		
		assertThrows(NullPointerException.class, () -> {
			calculatorService.calculateAverage();
		});
	}
	
	@DisplayName("Ejercicio 3.6")
	@Test
	void WhenDivisionByZeroThenZeroDivisionException() {
		assertThrows(ZeroDivisionException.class, () -> {
			calculatorService.calculateDivision(4, 0);
		});
		
		verify(basicOperationsService, never()).divide(4,0);
	}
	
	@DisplayName("Ejercicio 3.7")
	@Test
	void testPrintResultFromCalculateSum() {
		when(basicOperationsService.add(1, 4)).thenReturn(5.0);
		
		Double result = calculatorService.calculateSum(1, 4);
		
		assertEquals("El resultado es: " + result, calculatorService.printResult(result));		
	}
	
	@DisplayName("Ejercicio 3.8")	
	@ParameterizedTest
	@ValueSource(ints = {-4, 0, 2, 8, 30, 1000})
	void testIsOdd(int input) {
		assertTrue(calculatorService.isEven(input));
	}
	
	@DisplayName("Ejercicio 3.9")
	@Test
	void testSpyBasicOperationsServiceImpl() {
		BasicOperationsService myOperationsSrv = new BasicOperationsServiceImpl();
		BasicOperationsService spyMyOperationsSrv = spy(myOperationsSrv);
		calculatorService.setBasicOperationsService(spyMyOperationsSrv);
		
		calculatorService.calculateSum(2, 3);
		
		verify(spyMyOperationsSrv).add(2.0, 3.0);	
	}
	
	@DisplayName("Ejercicio 3.10")
	@Test
	void testSpyDataServiceImpl() {
		DataServiceImpl myDataService = new DataServiceImpl();
		DataServiceImpl spyMyDataService = spy(myDataService);
		calculatorService.setDataService(spyMyDataService);
				
		when(spyMyDataService.getListOfNumbers()).thenReturn(new int[] {2, 3});
		
		spyMyDataService.setListOfNumbers(new int[] {0, 1, 2, 4, 6, 9});
		
		assertTrue(spyMyDataService.getListOfNumbers().length == 2);		
	}
		
	
}
