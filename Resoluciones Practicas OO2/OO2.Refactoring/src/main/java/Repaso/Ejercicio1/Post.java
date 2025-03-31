package Repaso.Ejercicio1;

public abstract class Post {
	
	protected Post origen = null;
	
	public boolean verificarLongitud(String t) {
		int longitud = t.length();
		if ( longitud > 0  && longitud < 281) {
			return true;
		} else {
			return false;
		}
	}
	
	public Post getOrigen() {
		return this.origen;
	}
}
