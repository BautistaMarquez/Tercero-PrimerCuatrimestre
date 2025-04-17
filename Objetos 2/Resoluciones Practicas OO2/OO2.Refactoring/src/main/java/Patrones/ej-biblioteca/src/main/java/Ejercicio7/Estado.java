package Ejercicio7;

public interface Estado {
	
	public String getResultado(Calculadora c);
	
	public void setValor(double unValor, Calculadora c);
	
	public void mas(Calculadora c);
	
	public void menos(Calculadora c);
	
	public void por(Calculadora c);
	
	public void dividido(Calculadora c);
}
