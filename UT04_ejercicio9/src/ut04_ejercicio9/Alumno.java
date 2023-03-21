package ut04_ejercicio9;
import java.time.LocalDate;

public class Alumno extends Persona {
	private int nia;
	
	public Alumno(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, int nia) {
		super(dni, nombre, apellido1, apellido2, fechaNacimiento);
		this.nia = nia;
	}
	
	public int getNia() {
		return nia;
	}
	
	public void setNia(int nia) {
		this.nia = nia;
	}
}
