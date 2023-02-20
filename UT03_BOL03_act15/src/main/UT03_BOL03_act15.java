package main;
import java.util.ArrayList;
import java.util.List;

public class UT03_BOL03_act15 {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Manzana");
		lista1.add("Naranja");
		lista1.add("Plátano");
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("Mango");
		lista2.add("Piña");
		lista2.add("Melon");
		
		List<String> lista_unida = new ArrayList<String>(lista1);
		lista_unida.addAll(lista2);
		
		System.out.println("Lista unida: " + lista_unida);
	}
}
