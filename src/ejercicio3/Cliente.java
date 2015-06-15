package ejercicio3;

import java.util.Scanner;

public class Cliente extends Persona {
	
	private String cuit;
	private String direccion;
	
	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String descGral(){
		
		String datos;
		
		datos = super.descGral() + "\tCUIT: " + this.getCuit() + "\tDireccion: " + this.getDireccion();
		
		return datos;
	}
	
	public void cargaDatosCliente(Scanner s){
		
		super.cargaDatosPersona(s);
				
		System.out.println("Ingrese el CUIT: ");
		this.setCuit(s.nextLine());
		System.out.println("Ingrese la direccion");
		this.setDireccion(s.nextLine());
			
	}
	
}
