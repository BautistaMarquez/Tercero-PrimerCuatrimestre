package Ejercicio2;

public class EmpleadoPlanta extends Empleado {
	int antiguedad;
	int cantidadHijos;
	boolean estaCasado;
	
	
	public EmpleadoPlanta(int años, int hijos, boolean casado) {
		this.antiguedad = años;
		this.cantidadHijos = hijos;
		this.estaCasado = casado;
	}
	
	public double calcularBasico() {
		return 50000;
	}
	public double calcularAdicional() {
		if(this.estaCasado) {
			return (((this.cantidadHijos * 2000) + this.antiguedad * 2000) + 5000);
		}
		return ((this.cantidadHijos * 2000) + this.antiguedad * 2000);
	}
}
