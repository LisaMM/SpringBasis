package be.vdab;

public class EMailAdres {
	private final static String REG_EXPR = "^.+@.+\\.[a-z]+$";
	private final String adres;

	public EMailAdres(String adres) {
		if (!adres.matches(REG_EXPR)) {
			// adres controle met regular expression
			throw new IllegalArgumentException("Verkeerd emailadres");
		}
		this.adres = adres;
	}

	@Override
	public String toString() {
		return adres;
	}

	public String getUserName() {
		return adres.split("@")[0]; // username = deel voor @
	}

	public String getHostName() {
		return adres.split("@")[1]; // hostname = deel na @
	}

}
