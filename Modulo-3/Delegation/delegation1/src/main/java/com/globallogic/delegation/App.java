package com.globallogic.delegation;

/*
Ejercicio 1.1: Crear una clase ElectricalAppliance, con el atributo power(con valor 500) y
un método TurnOn que consuma 50 puntos de power.
Crear una clase ElectricalOven que herede de ElectricalAppliance y al ejecutar TurnOn consuma
75 puntos de power.
Crear una tercer clase LedAppliance con el metodo TurnOn (que no herede de
ElectricalAppliance) y que consuma 100 power.
La clase ElectricalOven tiene un atributo LedApplance y un método TurnLed que consuma 100
power al ElectricalOven.
Agregar en Main: Una instancia de ElectricalOven que al comenzar imprima su energía inicial
(power), ejecutar TurnOn, imprimir power, ejecutar TurnLed e imprimir su energía. (Debería
terminar con 325 de power).
Agregar los tests necesarios para demostrar que se realizó correctamente el ejercicio. */

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
