package com.globallogic.delegation;

public class ElectricalOven extends ElectricalAppliance {
	
	  private LedAppliance ledAppliance;

	    public ElectricalOven(LedAppliance ledApp) {
	        this.ledAppliance = ledApp;
	    }

	    @Override
	    public void turnOn() {
	        this.setPower(this.getPower() - 75);
	      
	    }

	    public void turnOnLed() {
	        this.setPower(ledAppliance.turnOn(this.power));
	    }
	    
}
