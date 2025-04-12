package Ejercicio2;

//En este caso capaz que lo mejor seria hacer aca una claseAbstracta que sea entre empleado temporario y empleado planta pero con el tema ese de que no esta bueno usar el super, no seria lo mejor. Tengo que preguntar si al final es mejor usar el super o no. 
public class EmpleadoTemporario extends Empleado {
	
	double cantidadHoras;
	int cantidadHijos;
	boolean estaCasado;
	
	
	public EmpleadoTemporario(double horas, int hijos, boolean casado) {
		this.cantidadHoras = horas;
		this.cantidadHijos = hijos;
		this.estaCasado = casado;
	}
	
	public double calcularBasico() {
		return (20000 + (300 * this.cantidadHoras));
	}
	public double calcularAdicional() {
		if(this.estaCasado) {
			return ((this.cantidadHijos * 2000) + 5000);
		}
		return (this.cantidadHijos * 2000);
	}
}
