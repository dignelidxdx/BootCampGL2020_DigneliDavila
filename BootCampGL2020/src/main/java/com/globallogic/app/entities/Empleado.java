package com.globallogic.app.entities;

public class Empleado extends Persona {

    public Empleado(String dNI) {
		this.dNI = dNI;
	}
    private String dNI;
    private int idEmpleado;   
    private double sueldoBase; 
    private int horaExtrasTrabajada;
    private double tipoIRPF;
    private static int importeHoraExtra;


	public String getDNI() {
		return dNI;
	}
	public void setDNI(String dNI) {
		this.dNI = dNI;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getHoraExtrasTrabajada() {
		return horaExtrasTrabajada;
	}
	public void setHoraExtrasTrabajada(int horaExtrasTrabajada) {
		this.horaExtrasTrabajada = horaExtrasTrabajada;
	}
	public double getTipoIRPF() {
		return tipoIRPF;
	}
	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}
	public static int getImporteHoraExtra() {
		return importeHoraExtra;
	}
	public static void setImporteHoraExtra(int importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
    }
    public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
    }
    	
    public int calculoComplemento(int importeCorrespondiente, int horasExtras) {
        return horasExtras * importeCorrespondiente;
    }

    public double sueldoBruto(int importeHoraExtra, int horaExtrasTrabajada) {

		// por revisar
        double pagoCorrespondiente = importeHoraExtra * horaExtrasTrabajada;        
        return pagoCorrespondiente;
    }
    
    public double calculoRetenciones(double sueldoBruto,double retenciones) {
		double retencionesActuales = 0;
        if(super.getEstadoCivil() == "C") {
			retencionesActuales = retenciones - 0.2;
		}
		if(super.getNumeroDeHijos() > 0) {
			for (int i = 1; i <= super.getNumeroDeHijos(); i++) {
				retencionesActuales = retenciones - 0.1;
				retenciones = retencionesActuales;
			}		
		}
		
		double nuevoSueldoBruto = sueldoBruto * ( 1 + retencionesActuales);

        return nuevoSueldoBruto;
    }

    @Override
    public String toString(){	
        return this.getDNI() + " " + this.getNombre() + "\nSueldo Base: " + this.getSueldoBase() + "\nHoras Extras: " + this.getHoraExtrasTrabajada() + "\ntipo IRPF: " + this.getTipoIRPF() + "\nCasado: " + this.getEstadoCivil() + "\nNúmero de Hijos: " + this.getNumeroDeHijos();
    }
    
}