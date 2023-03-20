package UT04_ejercicio8;

public class Gato extends Mascotas{
	private String color;
	private String peloLargo;
	
	public Gato(String nombre, int edad, String estado, int fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getPeloLargo() {
		return peloLargo;
	}
	
	@Override
	public void muestra() {
		System.out.println("Esta es la muestra");
	}
	
	@Override
	public void habla() {
		System.out.println("Ladra");
	}

	@Override
	public void cumpleaños() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
}


