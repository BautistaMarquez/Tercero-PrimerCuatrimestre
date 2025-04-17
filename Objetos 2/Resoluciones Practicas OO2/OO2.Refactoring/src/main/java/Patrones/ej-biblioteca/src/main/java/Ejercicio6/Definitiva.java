package Ejercicio6;

import java.util.stream.Collectors;

public class Definitiva implements Estado {
	
	public String obtenerInformacion(Excursion exc) {
		if(exc.retornarCupoActual() >= exc.cupoMax) {
			exc.setEstado(new Maxima());
			return exc.estado.obtenerInformacion(exc);
		} else {
			return this.realizarString(exc);
		}
	}
	
	public String realizarString(Excursion exc) {
		return exc.nombre + ", "+ exc.costo + ", " + exc.fechaInicio +", " + exc.fechaFin + ", " + exc.puntoDeEncuentro + ", " + this.retornarMails(exc) + this.calcularFaltantes(exc);
	}
	
	public int calcularFaltantes(Excursion exc) {	//Esto lo podria hacer la excursion?
		return exc.cupoMax - exc.retornarCupoActual();
	}
	
	public String retornarMails(Excursion exc) {
		return exc.usuariosInscriptos.stream().map(Usuario::getEmail).collect(Collectors.joining(", ")); //Entiendo que deberia mapear cada usuario a su email y lo recolecto con el collect separandolos por coma.
	}
}
