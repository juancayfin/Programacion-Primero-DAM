package main;
import java.util.ArrayList;

public class UT03_BOL03_act3 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("verde");
		colores.add("azul");
		
		colores.add(0, "rojo");
		
		System.out.println("Los colores en la lista son: " + colores);
	}
}
