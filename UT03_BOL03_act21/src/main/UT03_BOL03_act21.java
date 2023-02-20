package main;

import java.util.ArrayList;

public class UT03_BOL03_act21 {
	public static void main (String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Manzana");
		lista.add("Naranja");
		lista.add("Platano");
		
		System.out.println("Lista antes del reemplazo: " + lista);
		
		lista.set(1, "Piña");
	
		System.out.println("Lista después del reemplazo: " + lista);
	}
}
