package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//Funcionar funciona, busque con chatGPT lo del tema del try and catch porque no es algo que nosotros usemos. Averiguar bien que onda con eso.
public class ExporterJackson extends VoorheesExporter{
	ObjectMapper exporter;
	
	public ExporterJackson() {
		this.exporter = new ObjectMapper();
	}

	@Override 
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		 String Impresion;
		try {
			Impresion = this.exporter.writerWithDefaultPrettyPrinter().writeValueAsString(socios);
			System.out.println(Impresion);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		return "";
	}
	
	public static void main (String[] args) {
		
		ExporterJackson exporter= new ExporterJackson();
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setExporter(exporter);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(biblioteca.exportarSocios());
		
		
	}
}