package ejercicio3;

import java.util.Scanner;

public class Empleado extends Persona {
	
	private String puesto;
	private String legajo;
	
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	public String descGral(){
		
		String datos;
		
		datos = super.descGral() + "\tPuesto: " + this.getPuesto() + "\tLegajo: "+ this.getLegajo();
		
		return datos;
	}
	
	public void cargaDatosEmpleado(Scanner s){
		
		super.cargaDatosPersona(s);
		
		System.out.println("Ingrese el puesto: ");
		this.setPuesto(s.nextLine());
		System.out.println("Ingrese el legajo: ");
		this.setLegajo(s.nextLine());
		
	}


}