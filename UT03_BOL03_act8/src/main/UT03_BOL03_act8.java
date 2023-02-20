package main;
import java.util.ArrayList;
import java.util.Collections;

public class UT03_BOL03_act8 {
	public static void main(String[] args){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(8);
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		
		Collections.sort(numeros);
		
		System.out.println("Los números ordenados son: " + numeros);
	}
}
