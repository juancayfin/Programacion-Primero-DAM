package main;
import java.util.ArrayList;
import java.util.Collections;

public class UT03_BOL03_act14 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Manzana");
		lista.add("Naranja");
		lista.add("Plátano");
		lista.add("Mango");
		lista.add("Piña");
		
		System.out.println("Lista original: " + lista);
		
		Collections.swap(lista, 1, 3);
		
		System.out.println("Lista modificada: " + lista);
	}
}

