package minlin;

public class RecCommand implements Command{
	
	private Receiver r;
	
	public RecCommand(Receiver r) {
		this.r=r;
	}
	
	

	@Override
	public String doaction() {
		// TODO Auto-generated method stub
		r.action();
		return null;
	}



	public Receiver getR() {
		return r;
	}



	public void setR(Receiver r) {
		this.r = r;
	}

}
