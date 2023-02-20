package main;
import java.util.ArrayList;

public class UT03_BOL03_act13 {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Manzana");
		lista1.add("Naranja");
		lista1.add("Plátano");
		lista1.add("Mango");
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("Manzana");
		lista2.add("Naranja");
		lista2.add("Pera");
		lista2.add("Mango");
		
		boolean iguales = lista1.equals(lista2);
		
		if (iguales) {
			System.out.println("Las listas son iguales.");
		} else {
			System.out.println("Las listas son diferentes.");
		}
	}
}
