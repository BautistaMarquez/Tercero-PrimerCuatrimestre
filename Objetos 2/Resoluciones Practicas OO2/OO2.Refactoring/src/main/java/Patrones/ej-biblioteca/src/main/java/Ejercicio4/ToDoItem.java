package Ejercicio4;

import java.time.Duration;
import java.time.Instant;

//Usar el instant fue la forma que vi para hacer lo del tiempo asique no se si hay otra opcion.
public class ToDoItem {
	
	Estado estado = null;
	String nombre;
	Instant inicio;
	
        public ToDoItem(String name) {
        	this.nombre = name;
        	this.estado = new Pending(this);
        	this.inicio = Instant.now();
        }
/* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea pending. Si se encuentra en otro estado, no hace nada. */
        
        public void start() {
        	this.estado.start();
        }
        
/*Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su estado es paused. Caso contrario (pending o finished) genera un error informando la causa específica del mismo. */
        
        public void togglePause() {
        	this.estado.togglePause();
        }
        
/*Pasa el ToDoItem a finished, siempre y cuando su estado actual sea in-progress o paused. Si se encuentra en otro estado, no hace nada.*/
        
        public void finish() {
           this.estado.finish();
        }
        
/*Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start) hasta que se finalizó. En caso de que no esté finalizado, el tiempo que haya transcurrido hasta el momento actual. Si el ToDoItem no se inició, genera un error informando la causa específica del mismo. */
        
        public Duration workedTime() { //Como se usa el duration este??
        	if(!this.estado.equals(null)) {
        		return this.estado.workedTime(this.inicio);
        	}
        	throw new RuntimeException("El ToDoItem todavia no ha iniciado");

        }
        
/* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso contrario no hace nada." */
        
        public void addComment(String comment) {
        	this.estado.addComment(comment);  	
        }
        
        public void setEstado(Estado e) {
        	this.estado = e;
        }

        
        public static void main (String[] args) {
        	ToDoItem tdi = new ToDoItem ("Juan");
        	tdi.start();
        	tdi.start();
        	System.out.println(tdi.workedTime());

        	System.out.println(tdi.workedTime());
        	tdi.finish();
        }
}