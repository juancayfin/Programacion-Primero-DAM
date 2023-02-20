package main;
import java.util.ArrayList;

public class UT03_BOL03_act20 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>(3);
		lista.add("Manzana");
		lista.add("Naranja");
		lista.add("Platano");
		
		System.out.println("Capacidad de la lista antes del aumento: " + lista.size());
		
		lista.ensureCapacity(5);
		
		lista.add("Pera");
		lista.add("Mango");
		
		System.out.println("Capacidad de la lista después del aumento: " + lista.size());
	}
}
