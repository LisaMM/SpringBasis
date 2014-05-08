package be.vdab;

import java.util.*;

public class HelpdeskMedewerkers {
	private Iterable<String> namen;
	private Map<String, Integer> medewerkers;
	private final Properties werkers;
	
	public HelpdeskMedewerkers(Properties werkers) {
		this.werkers = werkers;
	}

	public void setNamen(Iterable<String> namen) {
		this.namen = namen;
	}
	
	public Iterable<String> getNamen() {
		return namen;
	}
	
	public String getInternalTelefoonNr(String naam) {
		return werkers.getProperty(naam);
	}
	
	@Override
	public String toString() {
		return medewerkers.toString();
	}
}
