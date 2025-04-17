package Ejercicio7;

//Este ejercicio me da muchas dudas. CONSULTAR, seguro que hay una mejor forma de hacerlo.

public class Calculadora {
	double valorAcumulado;
	Estado estado;
	
	public Calculadora() {
		this.valorAcumulado = 0;
		this.estado = new Esperar();
	}

	public String getResultado() {
		return this.estado.getResultado(this);
	}
	
	public void borrar() {
		this.valorAcumulado = 0;
		this.estado = new Esperar();
	}
	
	public void setValor(double unValor) {
		this.estado.setValor(unValor, this);
	}
	
	public void mas() {
		this.estado.mas(this);
	}
	
	public void menos() {
		this.estado.menos(this);
	}
	
	public void por() {
		this.estado.por(this);
	}
	
	public void dividido() {
		this.estado.dividido(this);
	}
	
	public void setEstado(Estado e) {
		this.estado = e;
	}
	
}
