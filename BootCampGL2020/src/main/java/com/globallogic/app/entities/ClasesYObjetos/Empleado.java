package com.globallogic.app.entities.ClasesYObjetos;

public class Empleado extends Persona {

    public Empleado(String dNI) {
		this.dNI = dNI;
	}
	public Empleado() {		
	}

    private String dNI;
    private int idEmpleado;   
    private double sueldoBase; 
    private int horaExtrasTrabajada;
    private double tipoIRPF;
    private static int importeHoraExtra;


	public String getDNI() {
		return this.dNI;
	}
	public void setDNI(String dNI) {
		this.dNI = dNI;
	}
	public int getIdEmpleado() {
		return this.idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getHoraExtrasTrabajada() {
		return this.horaExtrasTrabajada;
	}
	public void setHoraExtrasTrabajada(int horaExtrasTrabajada) {
		this.horaExtrasTrabajada = horaExtrasTrabajada;
	}
	public double getTipoIRPF() {
		return this.tipoIRPF;
	}
	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}
	public int getImporteHoraExtra() {
		return this.importeHoraExtra;
	}
	public static void setImporteHoraExtra(int importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
    }
    public double getSueldoBase() {
		return this.sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	// Método para el cálculo del complemento correspondiente a las horas extra realizadas.
    	
    public int calculoComplemento(int importeCorrespondiente, int horasExtras) {
		return horasExtras * importeCorrespondiente;
	}

	// Método para calcular el sueldo bruto (sueldo base + complemento por horas extras)

	public static int sueldoBruto(int importeHoraExtra, double sueldoBase) {

		// por revisar
		double pagoCorrespondiente = importeHoraExtra + sueldoBase;
		return (int) pagoCorrespondiente;
	}

	// Método para calcular las retenciones por IRPF. El porcentaje de IRPF se aplica sobre el sueldo bruto, teniendo en cuenta
 	// que el porcentaje que hay que aplicar es el tipo menos 2 puntos si el empleado está casado y menos 1 punto adicional por
	// cada hijo que tenga.
    
	public double calculoRetenciones(double retenciones, int importeHoraExtra, double sueldoBase) {
		double retencionesActuales = 0;
        if(this.getEstadoCivil() == 's' || this.getEstadoCivil() == 'S') {
			retencionesActuales = retenciones - 2;
		}
		if(this.getNumeroDeHijos() > 0) {
			for (int i = 1; i <= super.getNumeroDeHijos(); i++) {
				retencionesActuales = retenciones - 1;
				retenciones = retencionesActuales;
			}		
		}
		return sueldoBruto(importeHoraExtra, sueldoBase) * retencionesActuales / 100;
    }

    @Override
    public String toString(){	
        return "DNI: " + this.getDNI() + " Nombre: " + this.getNombre() + "\nSueldo Base: " + this.getSueldoBase() + "\nHoras Extras: " + this.getHoraExtrasTrabajada() + "\ntipo IRPF: " + this.getTipoIRPF() + "\nCasado: " + this.getEstadoCivil() + "\nNúmero de Hijos: " + this.getNumeroDeHijos();
	}
	  
}