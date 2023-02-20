package main;
import java.util.ArrayList;

public class UT03_BOL03_act2 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		
		
		for (String color : colores) {
			System.out.println(color);
		}
	}
}
