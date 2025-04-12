package Ejercicio4;



public class Paused extends Estado{
	
	public Paused (ToDoItem tdi) {
		super(tdi);
	}
	
	public void start() {
    	
    }
    public void togglePause() {
    	this.tdi.setEstado(new InProgress(this.tdi));
    }
    public void finish() {
    	this.tdi.setEstado(new Finished(this.tdi));
    }
   
    public void addComment(String comment) {
    	System.out.println(comment);
    }
}
