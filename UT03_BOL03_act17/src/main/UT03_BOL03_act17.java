package main;
import java.util.ArrayList;

public class UT03_BOL03_act17 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Manzana");
		lista.add("Naranja");
		lista.add("Mandarina");
		
		System.out.println("Lista original: " + lista);
		
		lista.clear();
		
		System.out.println("Lista vacía: " + lista);
	}
}
