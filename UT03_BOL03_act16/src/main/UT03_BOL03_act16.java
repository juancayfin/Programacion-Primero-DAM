package main;
import java.util.ArrayList;

public class UT03_BOL03_act16 {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Manzana");
		lista1.add("Naranja");
		lista1.add("Plátano");
		
		ArrayList<String> lista2 = (ArrayList<String>) lista1.clone();
		
		System.out.println("Lista original: " + lista1);
		System.out.println("Lista clonada: " + lista2);
	}
}
