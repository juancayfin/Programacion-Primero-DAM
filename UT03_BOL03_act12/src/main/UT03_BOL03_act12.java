package main;
import java.util.ArrayList;
import java.util.List;

public class UT03_BOL03_act12 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("manzana");
		lista.add("naranja");
		lista.add("plátano");
		lista.add("mango");
		lista.add("piña");
		
		List<String> sublista = lista.subList(1,  4);
		
		System.out.println("Sublista: " + sublista);
	}
}
