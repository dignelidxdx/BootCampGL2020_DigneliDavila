package main.java.com.globallogic.patterns.entities;

public class ElectricalOven extends ElectricalAppliance {
    
    private LedAppliance ledAppliance;

    public ElectricalOven() {
        ledAppliance = new LedAppliance();
    }

    @Override
    public void turnOn() {
        super.setPower(this.getPower() - 75);
      
    }

    void turnOnLed() {
        this.setPower(ledAppliance.turnOn(this.power));
    }
}