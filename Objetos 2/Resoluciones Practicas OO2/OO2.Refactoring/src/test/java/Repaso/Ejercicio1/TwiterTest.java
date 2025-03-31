package Repaso.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwiterTest {

	protected Twiter sistema;
	protected Usuario user;
	protected Tweet twit;
	protected Retweet retwit;
	
	@BeforeEach
	public void seteo() {
		sistema = new Twiter();
		user = new Usuario("Juan01");
		twit = new Tweet("Hola Mundo");
		retwit = new Retweet(twit);
	}
	
	@Test
	public void TestBuscar(){
		sistema.agregarUsuario(user);
		sistema.agregarUsuario(user);
		assertEquals(1,sistema.UsuariosRegistrados.size());
		assertEquals(true,sistema.verificarUsuario(user.getName()));
		assertEquals(false,sistema.verificarUsuario("Nombre"));
		sistema.eliminarUsuario(user);
		assertEquals(0,sistema.UsuariosRegistrados.size());
	}
	
	@Test
	public void TestTwitear() {
		assertEquals(true,twit.verificarLongitud(twit.getTexto()));
		twit.texto = "";
		//Tweet twit2 = new Tweet("");
		assertEquals(false,user.twitear("")); //error. Una opcion seria que el sistema verifique la longitud? Y si un string es 0 o mayor entonces no se inicializa un twit? Ademas, el sistema deberia conocer los tweets? Entiendo que con conocer a las personas ya los conoce.
		assertEquals(false,twit.verificarLongitud(twit.getTexto()));
		//assertEquals(false,retwit.verificarLongitud(retwit.getOrigen().getTexto()));
		twit.texto = "Holaaaaaaaaaa";
		//assertEquals(true,retwit.verificarLongitud(retwit.getOrigen().getTexto()));
		twit.texto = "Holaaaaaaaaaaasfdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//assertEquals(false,retwit.verificarLongitud(retwit.getOrigen().getTexto()));
		assertEquals(false,twit.verificarLongitud(""));
	}

}
