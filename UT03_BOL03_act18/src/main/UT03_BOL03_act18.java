package main;
import java.util.ArrayList;

public class UT03_BOL03_act18 {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("Manzana");
		lista2.add("Naranja");
		lista2.add("Platano");
		
		boolean estaVacia1 = lista1.isEmpty();
		boolean estaVacia2 = lista2.isEmpty();
		
		System.out.println("¿Lista 1 está vacía?: " + estaVacia1);
		System.out.println("¿Lista 2 está vacía?: " + estaVacia2);
	}
}
