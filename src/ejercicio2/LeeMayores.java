package ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class LeeMayores {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> nros = new ArrayList<Integer>();
		int menor = 0, next = 0;
		
		System.out.println("Ingrese el menor");
		menor = s.nextInt();
		
		for (int i = 0; i < 10; i++) {	
			System.out.println("Ingrese el " + String.valueOf(i + 1) + " número");
			next = s.nextInt();
			if (next > menor) {
				nros.add(next);
			}
		}
		
		for (int i = 0; i < nros.size(); i++) {
			System.out.println(String.valueOf(nros.get(i)));
		}
		
		s.close();
	}
}
