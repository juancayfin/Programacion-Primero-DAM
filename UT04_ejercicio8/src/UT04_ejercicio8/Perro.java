package UT04_ejercicio8;

public class Perro extends Mascotas{
	private String raza;
	private String pulgas;
	
	public Perro(String nombre, int edad, String estado, int fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public String getPulgas() {
		return pulgas;
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


