package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Para el ejercicio2 cada elemento es una clase y esa clase sabe si le gana o pierde a otra. 
public class Twiter {

	List<Usuario> UsuariosRegistrados = new ArrayList<Usuario>();
	
	public Twiter() {
		
	}
	
	public void agregarUsuario(Usuario u) {
		
		boolean encontro = this.verificarUsuario(u.getName());
		if(encontro) {
			System.out.println("Ya existe un usuario con el ScreenName ingresado");
		} else {
			this.UsuariosRegistrados.add(u);
		}
		
	}
	
	public boolean verificarUsuario(String name) {
		boolean encontro = this.UsuariosRegistrados.stream().anyMatch(usuario -> usuario.getName().equals(name));
		return encontro;
	}
	
	public void eliminarUsuario(Usuario u) {
		boolean encontro = this.verificarUsuario(u.getName());
		if(encontro) {
			int i;
			for(i=0; i < u.TweetsRealizados.size();i++) {
				this.eliminarRetweets(u.TweetsRealizados.get(i));
			}
			u.borrarTweets();
			this.UsuariosRegistrados.remove(u);
		} else {
			System.out.println("El usuario ingresado no existe");
		}
	}
	
		public void eliminarRetweets(Post t) {
		int i;
		for(i = 0; i< this.UsuariosRegistrados.size(); i++) {
			this.UsuariosRegistrados.get(i).TweetsRealizados = this.UsuariosRegistrados.get(i).TweetsRealizados.stream().filter(twit -> twit.getOrigen().equals(null)).collect(Collectors.toList());
		}
	}
}
