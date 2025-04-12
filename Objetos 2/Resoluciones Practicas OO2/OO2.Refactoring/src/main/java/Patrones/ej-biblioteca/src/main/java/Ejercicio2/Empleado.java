package Ejercicio2;
//Utilizo el Template Method con el tema del metodo sueldo.
public abstract class Empleado {
	
	public final double sueldo() {
		return (this.calcularBasico() + this.calcularAdicional()) - this.calcularDescuento();
	}
	
	protected abstract double calcularBasico();
	protected abstract double calcularAdicional();
	private double calcularDescuento() {
		return ((this.calcularBasico() * 0.13) + (this.calcularAdicional() * 0.05)); 
	}
}
