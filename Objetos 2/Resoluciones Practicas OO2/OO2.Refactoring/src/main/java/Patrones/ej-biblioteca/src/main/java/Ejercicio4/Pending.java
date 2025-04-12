package Ejercicio4;



public class Pending extends Estado{
	
	public Pending (ToDoItem tdi) {
		super(tdi);
	}
	
    public void start() {
    	this.tdi.setEstado(new InProgress(this.tdi));
    }
    
    public void togglePause() {
    	throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }
    public void finish() {
    	throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void addComment(String comment) {
    	System.out.println(comment);
    }
}
