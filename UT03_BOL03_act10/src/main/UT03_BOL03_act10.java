package main;
import java.util.ArrayList;
import java.util.Collections;

public class UT03_BOL03_act10 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		
		Collections.shuffle(colores);
		System.out.println("Los colores mezclados son: " + colores);
	}
}
