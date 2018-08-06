package minlin;

public class Client {
	public static void main(String[] args) {
		
		Receiver r = new Receiver();
		r.action();
		
		Command c = new RecCommand(r);
		c.doaction();
		
		
		Invoker i = new Invoker(c);
		i.action();
	}

}
