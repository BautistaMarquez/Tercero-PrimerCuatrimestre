package Ejercicio7;

public class Sumar implements Estado{
	public String getResultado(Calculadora c) {
		c.setEstado(new Error());
		return c.estado.getResultado(c);
	}
	
	public void setValor(double unValor, Calculadora c) {
		c.valorAcumulado = c.valorAcumulado + unValor;
	}
	
	public void mas(Calculadora c) {
		c.setEstado(new Error());
	}
	
	public void menos(Calculadora c) {
		c.setEstado(new Error());
	}
	
	public void por(Calculadora c) {
		c.setEstado(new Error());
	}
	
	public void dividido(Calculadora c) {
		c.setEstado(new Error());
	}
}
