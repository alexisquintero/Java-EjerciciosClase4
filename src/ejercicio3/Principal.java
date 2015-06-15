package ejercicio3;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
	
	ArrayList<Persona> per = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.ejecutar();

	}
	
	public void ejecutar(){
		
		Scanner s = new Scanner(System.in);
				
		this.cargaPersonas(s);
		this.ordenaPersonas();
		this.muestraPersonas();
		
		s.close();
	}
	
	private void cargaPersonas(Scanner s){
		
		String resp = "";
		int i = 0;
		
		while (i < 5) {
			System.out.println("Empleado o Cliente (E/C)?");
			resp = s.nextLine().toUpperCase();
			if (resp.equalsIgnoreCase("E")) {
				per.add(this.cargaEmpleado(s));
				i++;
			}else if (resp.equalsIgnoreCase("C")) {
				per.add(this.cargaCliente(s));
				i++;
			}
		}		
	}

	private void muestraPersonas(){
	
		for (int i = 0; i < per.size(); i++) {
			System.out.println("Los datos de la persona nro " + String.valueOf(i + 1) + " son: " + per.get(i).descGral());
		}
	}
	
	public static Comparator<Persona> PersonaComparator = new Comparator<Persona>(){


		public int compare(Persona o1, Persona o2) {
			int dni1 = o1.getDni();
			int dni2 = o2.getDni();
			
			return dni1 - dni2;
		}
		
	};
	
	private void ordenaPersonas(){
		
		Collections.sort(per, PersonaComparator);
		
	}
	
		
	private Empleado cargaEmpleado(Scanner s){
		
		Empleado emp = new Empleado();
		
		emp.cargaDatosEmpleado(s);
		
		return emp;
	}
	
	private Cliente cargaCliente(Scanner s){
		
		Cliente cli = new Cliente();
		
		cli.cargaDatosCliente(s);
		
		return cli;
	}

}

