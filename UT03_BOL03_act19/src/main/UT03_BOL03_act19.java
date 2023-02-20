package main;
import java.util.ArrayList;

public class UT03_BOL03_act19 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>(10);
		lista.add("Manzana");
		lista.add("Naranja");
		lista.add("Platano");
		
		System.out.println("Capacidad de la lista antes del recorte: " + lista.size());
		
		lista.trimToSize();
		
		System.out.println("Capacidad de la lista después dle recorte: " + lista.size());
	}
}
