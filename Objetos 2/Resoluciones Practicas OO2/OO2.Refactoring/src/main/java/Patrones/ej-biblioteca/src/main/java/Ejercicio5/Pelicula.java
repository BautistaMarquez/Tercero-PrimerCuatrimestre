package Ejercicio5;

import java.util.ArrayList;

public class Pelicula {
	String titulo;
	int añoDeEstreno;
	int puntaje;
	ArrayList<Pelicula> peliculasSimilares;
	
	public Pelicula(String t, int año, int p) {
		this.titulo = t;
		this.añoDeEstreno = año;
		this.puntaje = p;
		peliculasSimilares = new ArrayList<Pelicula>();
	}
	
	public void definirSimilaridad(Pelicula peli) { //En este casso habria que chequear que la pelicula ya no este incluida supongo.
		this.peliculasSimilares.add(peli);
		peli.peliculasSimilares.add(this);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAñoDeEstreno() {
		return añoDeEstreno;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public ArrayList<Pelicula> getPeliculasSimilares() {
		return peliculasSimilares;
	}
	
	
	
	//Sino posible Override al toString
}
