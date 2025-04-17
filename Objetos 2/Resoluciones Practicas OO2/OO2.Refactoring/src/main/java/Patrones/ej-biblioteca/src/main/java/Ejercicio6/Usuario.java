package Ejercicio6;

public class Usuario {

	String nombre;
	String apellido;
	String email;
	
	public Usuario(String n, String a, String e) {
		this.nombre = n;
		this.apellido = a;
		this.email = e;
	}
	
	public String getEmail() {
		return this.email;
	}
}
