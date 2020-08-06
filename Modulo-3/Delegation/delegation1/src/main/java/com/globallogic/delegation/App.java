package com.globallogic.delegation;

public class App {

	public static void main( String[] args )
    {
		ElectricalOven electricalOven = new ElectricalOven(new LedAppliance());
        
        System.out.println(electricalOven.getPower());
        electricalOven.turnOn();
        System.out.println(electricalOven.getPower());
        electricalOven.turnOnLed();
        System.out.println(electricalOven.getPower());
    }
	
}
