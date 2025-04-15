package Ejercicio5;

import java.util.List;
//En estos casos no estoy teniendo a cuenta que no llegue a 3 peliculas
//Para el tema de la similaridad tener un set en la clase para que una pelicula reciba la lista de peliculas que el usuario vio y este se fije si es similar a alguna de todas esas.
public interface CriterioDeSugerencia {
	public List<Pelicula> sugerir(Decodificador deco);
};
