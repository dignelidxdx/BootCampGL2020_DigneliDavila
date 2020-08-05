package mockito.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import coverage.example.Mock;
import coverage.example.Vehicle;

@ExtendWith(MockitoExtension.class)
class VehicleCrashTest {
	
	@InjectMocks
	private VehicleCrash vehicle;
	
	@Mock 
	Vehicle vehicleMock;
	
	@Test
	void WhenNoCrashNoValueThenOk() {
		VehicleCrash crashTest = new VehicleCrash();
		
		assertEquals(0, crashTest.getTotalEnergy());
		assertEquals(0, crashTest.getTotalVehicles());
		assertEquals("No crashes measured",crashTest.toString());
	}

	@Test
	void WhenCrashAndCorrectValueThenOk() {
		VehicleCrash crashTest = new VehicleCrash();
		Mockito.when(vehicleMock.getMass()).thenReturn(10.0);
		Mockito.when(vehicleMock.getMaxSpeed()).thenReturn(5.0);
		
		crashTest.crash(vehicleMock);
		
		assertEquals(125.0, crashTest.getTotalEnergy());
		assertEquals(1, crashTest.getTotalVehicles());
	}

}
