package main;
import java.util.ArrayList;

public class UT03_BOL03_act6 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("amarillo");
		
		colores.remove(2);
		
		System.out.println("Los colores en la lista son: " + colores);
	}
}
