package UT04_ejercicio8;

public abstract class Mascotas {
	private String nombre;
	private int edad;
	private String estado;
	private int fechaNacimiento;
	
	public Mascotas(String nombre, int edad, String estado, int fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public int getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public abstract void muestra();
	
	public abstract void cumpleaños();
	
	public abstract void morir();
	
	public abstract void habla();
}

