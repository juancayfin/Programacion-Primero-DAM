package main;
import java.util.ArrayList;
import java.util.Collections;

public class UT03_BOL03_act11 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		
		Collections.reverse(colores);
		
		System.out.println("Los colores invertidos son: " + colores);
	}
}
