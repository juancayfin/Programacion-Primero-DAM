package main;
import java.util.ArrayList;

public class UT03_BOL03_act9 {
	public static void main(String[] args) {
		ArrayList<String> colores1 = new ArrayList<String>();
		
		colores1.add("rojo");
		colores1.add("verde");
		colores1.add("azul");
		
		ArrayList<String> colores2 = new ArrayList<String>(colores1);
		
		System.out.println("La lista original es: " + colores1);
		System.out.println("La lista copiada es: " + colores2);
	}
}
