package Repaso.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	List<Post> TweetsRealizados = new ArrayList<Post>();
	String ScreenName;
	
	public Usuario (String s) {
		this.ScreenName = s;
	}
	
	public String getName () {
		return this.ScreenName;
	}
	
	public boolean twitear(String t) {
		Tweet twit = new Tweet(t);
		if(twit.getTexto().equals(null)) { 
			return false;
		} else {
			this.TweetsRealizados.add(twit);
			return true;
		}
	}
	
	public void retwitear(Tweet t) {
		Retweet retwit = new Retweet(t);
		this.TweetsRealizados.add(retwit);
		
	}
	
	public void borrarTweets() {
		this.TweetsRealizados.clear();
	}
}

