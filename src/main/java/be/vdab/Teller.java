package be.vdab;

public class Teller {
	private int teller;
	
	public Teller(int teller) {
		System.out.printf("Teller constructor,  teller=%d\n", teller);
		this.teller = teller;
	}
	
	public void verhoogTeller() {
		teller++;
	}
	
	public int getTeller() {
		return teller;
	}
}
