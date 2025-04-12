package Ejercicio4;



public class InProgress extends Estado{
	
	public InProgress (ToDoItem tdi) {
		super(tdi);
	}
	
	public void start() {
    	
    }
    public void togglePause() {
    	this.tdi.setEstado(new Paused(this.tdi));
    }
    public void finish() {
    	this.tdi.setEstado(new Finished(this.tdi));
    }
    
    public void addComment(String comment) {
    	System.out.println(comment);
    }
}
