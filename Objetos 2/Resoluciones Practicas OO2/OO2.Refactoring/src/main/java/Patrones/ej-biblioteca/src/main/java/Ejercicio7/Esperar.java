package Ejercicio7;

public class Esperar implements Estado{
	public String getResultado(Calculadora c) {
		return c.valorAcumulado + "";
	}
	
	public void setValor(double unValor, Calculadora c) {
		c.valorAcumulado = unValor;
	}
	
	public void mas(Calculadora c) {
		c.setEstado(new Sumar());
	}
	
	public void menos(Calculadora c) {
		c.setEstado(new Restar());
	}
	
	public void por(Calculadora c) {
		c.setEstado(new Multiplicar());
	}
	
	public void dividido(Calculadora c) {
		c.setEstado(new Dividir());
	}
}
