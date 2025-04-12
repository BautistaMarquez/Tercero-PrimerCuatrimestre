package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//Para preguntar si es como entiendo: En este caso la clase ExporterJSON funciona como Adapter para la clase JSONArray entiendo que seria el Adaptee. Entonces el adaptador que seria ExporterJSON extiende el Target VoorhessExporter para que el Adaptee entienda el mensaje que seria exportar entonces el adaptador entiende el mensaje del target exportar y le traduce la info a la clase adaptada que seria JSONArray y en este caso utilizo el JSONObject justamente para traducir esta info.
//Entiendo esta bien setearle el ExporterJSON a la biblioteca sino no tiene sentido.
public class ExporterJSON extends VoorheesExporter {
	JSONArray socios;
	
	public ExporterJSON() {
		this.socios = new JSONArray();
	}
	
	@Override 
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONObject soc = new JSONObject();
		socios.forEach(socio -> {
			soc.put("nombre", socio.getNombre());
			soc.put("legajo", socio.getLegajo());
			soc.put("email", socio.getEmail());
			
			this.socios.add(soc);
		});

		return this.socios.toJSONString();
	}
	
	public static void main (String[] args) {
		
		ExporterJSON exporter= new ExporterJSON();
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setExporter(exporter);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(biblioteca.exportarSocios());
		
		
	}
}
