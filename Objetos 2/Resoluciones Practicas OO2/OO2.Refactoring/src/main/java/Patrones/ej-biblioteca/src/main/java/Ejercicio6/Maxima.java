package Ejercicio6;

public class Maxima implements Estado{
	public String obtenerInformacion(Excursion exc) {
		return this.realizarString(exc);
	}
	
	public String realizarString(Excursion exc) {
		return exc.nombre + ", "+ exc.costo + ", " + exc.fechaInicio +", " + exc.fechaFin + ", " + exc.puntoDeEncuentro;
	}
}
