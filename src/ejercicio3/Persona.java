package ejercicio3;

import java.util.Scanner;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String descGral(){
		
		String datos;
		
		datos = "DNI: " + this.getDni() + "\tNombre: " + this.getNombre() + "\tApellido: " + this.getApellido();
		
		return datos;
	}
	
	public void cargaDatosPersona(Scanner s){
			
		System.out.println("Ingrese el DNI: ");
		this.setDni(s.nextInt());
		System.out.println("Ingrese el nombre: ");
		this.setNombre(s.nextLine());
		System.out.println("Ingrese el apellido: ");
		this.setApellido(s.nextLine());
	}
}

