package Ejercicio4;

import java.time.Duration;
import java.time.Instant;

//Puede ser interface? Supongo que si.
//Preguntar si es mejor que el ToDoItem se pase como parametro o da igual.
public abstract class Estado {
	
	ToDoItem tdi;
	
	public Estado(ToDoItem tdi) {
		this.tdi = tdi;
	}
	
    public abstract void start();
    public abstract void togglePause();
    public abstract void finish();
    public Duration workedTime(Instant inicio) {
    	Instant fin = Instant.now();
    	return Duration.between(inicio, fin);
    }
    public abstract void addComment(String comment);
}
