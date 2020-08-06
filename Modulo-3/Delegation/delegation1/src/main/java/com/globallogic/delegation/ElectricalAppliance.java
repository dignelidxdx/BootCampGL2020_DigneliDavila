package com.globallogic.delegation;

public class ElectricalAppliance {
	
	protected int power;

    public ElectricalAppliance() {
        this.power = 500;
    }

    public int getPower() {

        return power;
    }

    public void setPower(int power){
       this.power = power;
    }

    public void turnOn( ) {
        this.power = this.power - 50;
    }


}
