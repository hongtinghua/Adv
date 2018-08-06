package minlin;

public class Invoker {
	
	private Command c;
	
	public Invoker(Command c) {
		this.c=c;
	}
	
	public String action() {
		c.doaction();
		return null;
	}

}
