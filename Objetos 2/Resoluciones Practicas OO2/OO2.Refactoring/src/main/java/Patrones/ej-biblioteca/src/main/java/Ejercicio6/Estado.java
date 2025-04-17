package Ejercicio6;

public interface Estado {
	public String obtenerInformacion(Excursion exc);
	public String realizarString(Excursion exc);
}
//Esta bien el tema de hacer los metodos adentro de los estados osea me parece que cada estado puede tener sus metodos. porque es raro que la clase Excursion tenga que hacer las cosas que se hacen en los metodos pero me genera duda por el tema de la envidia y eso pero diria que esta bien.