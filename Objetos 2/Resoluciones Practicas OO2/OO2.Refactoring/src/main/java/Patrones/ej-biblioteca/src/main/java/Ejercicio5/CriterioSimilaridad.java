package Ejercicio5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//ME FALTA ESTO. NO SE COMO HACER PARA QUE FUNCIONEEEEEEEEEEEEEE
public class CriterioSimilaridad implements CriterioDeSugerencia{

	public List<Pelicula> sugerir(Decodificador deco){
		List<Pelicula> peliculas = deco.GrillaDePeliculas;
		return peliculas.stream().filter(p -> !deco.PeliculasReproducidas.contains(p)).limit(3).collect(Collectors.toList());
				
	}
	
	public List<Pelicula> ordenarLista(ArrayList<Pelicula> peliculas){
		List<Pelicula> p = peliculas.stream().sorted((p1, p2) -> Integer.compare(p1.getAñoDeEstreno(), p2.getAñoDeEstreno())).collect(Collectors.toList());
		return p;
	}

}
