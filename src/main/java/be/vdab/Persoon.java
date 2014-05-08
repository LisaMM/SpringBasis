package be.vdab;

public class Persoon {
	private int persoonNr;
	private String voornaam;
	private String familienaam;
	private int aantalKinderen;

	public Persoon(int persoonNr, String voornaam, String familienaam,
			int aantalKinderen) {
		this.aantalKinderen = aantalKinderen;
		this.familienaam = familienaam;
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
	}

	public int getPersoonNr() {
		return persoonNr;
	}

	public void setPersoonNr(int persoonNr) {
		this.persoonNr = persoonNr;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public int getAantalKinderen() {
		return aantalKinderen;
	}

	public void setAantalKinderen(int aantalKinderen) {
		this.aantalKinderen = aantalKinderen;
	}

	@Override
	public String toString() {
		return persoonNr + ":" + voornaam + " " + familienaam;
	}
}
