/**
 * 
 */
package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sun.tools.javac.util.List;

import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@Mock
	private BasicOperationsService basicOpSer;
	
	@Mock
	private DataService dataService;
	
	@BeforeEach
	 void setUp() {
		basicOpSer.get
		
		(when(dataService.getListOfNumbers())).thenReturn(1, 2, 3, 4, 5);
		
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

		
	
}
