package Repaso.Ejercicio1;

public class Tweet extends Post{

	String texto;
	
	public Tweet (String t) {
		if (verificarLongitud(t)) {
			this.texto = t;
		} else {
			System.out.println("el texto no es valido debido a su longitud");
			this.texto = null;
		}
	}
	
	public String getTexto() {
		return this.texto;
	}
	
}
