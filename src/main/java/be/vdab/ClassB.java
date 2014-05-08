package be.vdab;

public class ClassB {
	private final String telefoonNrHelpDesk;
	private final int aantalPogingenUpdateKlant;
	
	public ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
	}
	
	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}
	
	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}
	
	public String getBoodschap() {
		return "Ik ben een ClassB object";
	}
}
