package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	CriterioDeSugerencia criterio;
	ArrayList<Pelicula> GrillaDePeliculas;
	ArrayList<Pelicula> PeliculasReproducidas;
	
	public Decodificador(CriterioDeSugerencia crit, ArrayList<Pelicula> Peliculas) {
		this.criterio = crit;
		GrillaDePeliculas = new ArrayList<Pelicula>();
		this.GrillaDePeliculas.addAll(Peliculas);
		PeliculasReproducidas = new ArrayList<Pelicula>();
	}
	
	public void guardarPeliculaReproducida(Pelicula peli) {
		this.PeliculasReproducidas.add(peli);
	}
	
	public String sugerirPeliculas() {
		List<Pelicula> peliculas = this.criterio.sugerir(this);
		return peliculas.toString();
	}
	
	public void cambiarCriterio(CriterioDeSugerencia crit) {
		this.criterio = crit;
	}
	
}
