package ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;


public class Carga10elementos {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int cant = 10;
		
		System.out.println("Ingrese la cantidad de elementos a ingresar");
		cant = s.nextInt();
		for (int i = 0; i < cant; i++) {
			System.out.println("Ingrese el " + String.valueOf(i + 1) + " elemento");
			lista.add(s.nextInt());
		}
		
		for (int i = (lista.size()-1); i > -1; i--) {
			System.out.println(String.valueOf(lista.get(i)));
		}
		
		s.close();
	}

}
