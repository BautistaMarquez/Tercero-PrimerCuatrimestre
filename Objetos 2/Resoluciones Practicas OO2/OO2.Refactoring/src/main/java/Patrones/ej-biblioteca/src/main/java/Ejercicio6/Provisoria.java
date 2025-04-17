package Ejercicio6;

public class Provisoria implements Estado{
	
	public String obtenerInformacion(Excursion exc) {
		if(exc.usuariosInscriptos.size() >= exc.cupoMin) {
			exc.setEstado(new Definitiva());
			return exc.estado.obtenerInformacion(exc);
		} else {
			return this.realizarString(exc);
		}
	}
	
	public String realizarString(Excursion exc) {
		return exc.nombre + ", "+ exc.costo + ", " + exc.fechaInicio +", " + exc.fechaFin + ", " + exc.puntoDeEncuentro + ", " + this.calcularFaltantes(exc) + ", ";
	}
	
	public int calcularFaltantes(Excursion exc) {	//Esto lo podria hacer la excursion?
		return exc.cupoMin - exc.retornarCupoActual();
	}
}
