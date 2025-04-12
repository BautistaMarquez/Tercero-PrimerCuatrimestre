package Ejercicio4;



public class Finished extends Estado{
	
	public Finished (ToDoItem tdi) {
		super(tdi);
	}
	
	public void start() {
    	
    }
    public void togglePause() {
    	throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }
    public void finish() {
    	throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }
    
    public void addComment(String comment) {
    	
    }
}
