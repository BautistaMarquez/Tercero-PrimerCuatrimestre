package Ejercicio5;

import java.util.List;
//En estos casos no estoy teniendo a cuenta que no llegue a 3 peliculas
public interface CriterioDeSugerencia {
	public List<Pelicula> sugerir(Decodificador deco);
};
