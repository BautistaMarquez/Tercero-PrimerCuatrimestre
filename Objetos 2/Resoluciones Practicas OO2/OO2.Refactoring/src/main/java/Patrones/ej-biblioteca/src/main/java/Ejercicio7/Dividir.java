package Ejercicio7;

public class Dividir implements Estado{
	public String getResultado(Calculadora c) {
		c.setEstado(new Error());
		return c.estado.getResultado(c);
	}
	
	public void setValor(double unValor, Calculadora c) {
		if(unValor != 0) {
			c.valorAcumulado = c.valorAcumulado / unValor;
			c.setEstado(new Esperar());
			c.estado.getResultado(c);
		} else {
			c.setEstado(new Error());
			c.estado.getResultado(c);
		}
		
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
