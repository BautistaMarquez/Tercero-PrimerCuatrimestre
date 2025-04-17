package Ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	
	String nombre;
	LocalDate fechaInicio;
	LocalDate fechaFin;
	String puntoDeEncuentro;
	Estado estado;
	double costo;
	int cupoMin;
	int cupoMax;
	List<Usuario> usuariosInscriptos;
	List<Usuario> listaDeEspera;
	
	public Excursion(String n, LocalDate fi, LocalDate ff, String p, int min, int max, double c) {
		this.nombre = n;
		this.fechaInicio = fi;
		this.fechaFin = ff;
		this.puntoDeEncuentro = p;
		this.cupoMin = min;
		this.cupoMax = max;
		this.estado = new Provisoria();
		this.usuariosInscriptos = new ArrayList<Usuario>(); 
		this.listaDeEspera = new ArrayList<Usuario>();
		this.costo = c;
		
	}
	
	public void inscribir (Usuario unUsuario) {
		if(this.retornarCupoActual()< this.cupoMax) { //Menor porque la lista empieza en 0, no?
			this.usuariosInscriptos.add(unUsuario);
		}else {
			this.listaDeEspera.add(unUsuario);
		}
	}
	
	public int retornarCupoActual() {
		return this.usuariosInscriptos.size();
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}
	
	public void setEstado(Estado e) {
		this.estado = e;
	}
	
	public static void main(String[] args) {	//TESTs
		Excursion ExcursionALasMontañas = new Excursion("ExcursionALasMontañas", LocalDate.now(), LocalDate.now(), "Mendoza", 1, 2, 100);
		
		Usuario user1 = new Usuario("Juan", "Perez", "JuanPerez123@Gmail.com");
		Usuario user2 = new Usuario("Lucas", "Perez", "LucasPerez123@Gmail.com");
		
		System.out.println(ExcursionALasMontañas.obtenerInformacion());
		ExcursionALasMontañas.inscribir(user1);
		
		System.out.println(" ------------------------------------ ");
		
		System.out.println(ExcursionALasMontañas.obtenerInformacion());
		ExcursionALasMontañas.inscribir(user2);
		
		System.out.println(" ------------------------------------ ");
		System.out.println(ExcursionALasMontañas.obtenerInformacion());
	}
	
}
