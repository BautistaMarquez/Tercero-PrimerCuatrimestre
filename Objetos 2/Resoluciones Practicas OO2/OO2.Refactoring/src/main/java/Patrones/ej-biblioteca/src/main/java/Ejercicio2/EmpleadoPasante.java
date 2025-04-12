package Ejercicio2;

public class EmpleadoPasante extends Empleado {
		int cantidadExamenes;
		
		public EmpleadoPasante(int examenes) {
			this.cantidadExamenes = examenes;
		}
		
	public  double calcularBasico() {
		return 20000;
	}
	public double calcularAdicional() {
		return 2000 * this.cantidadExamenes;
	}
}
