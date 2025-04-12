package Ejercicio2Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio2.EmpleadoPasante;
import Ejercicio2.EmpleadoPlanta;
import Ejercicio2.EmpleadoTemporario;
import Ejercicio2.Empleado;



public class EmpleadoTest {
	EmpleadoPasante e1;
	EmpleadoPlanta e2;
	EmpleadoTemporario e3;
	
	@BeforeEach
	public void seteo() {
		e1 = new EmpleadoPasante(10);
		e2 = new EmpleadoPlanta(5,2,true);
		e3 = new EmpleadoTemporario(100,1,false);
		System.out.println("Mi sueldo de Pasante es " + e1.sueldo());
		System.out.println("Mi sueldo de Planta es " + e2.sueldo());
		System.out.println("Mi sueldo de Temporario es " + e3.sueldo());
	}
	
	@Test
	public void TestTotal(){
		assertEquals(36400, e1.sueldo());
		assertEquals(61550, e2.sueldo());
		assertEquals(45400, e3.sueldo());
	}
	
}
