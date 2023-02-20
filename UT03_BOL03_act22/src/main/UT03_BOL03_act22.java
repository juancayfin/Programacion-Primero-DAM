package main;

import java.util.ArrayList;

public class UT03_BOL03_act22 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Manzana");
		lista.add("Naranja");
		lista.add("Platano");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Elemento en la posición " + i + ": " + lista.get(i));
		}
	}
}
