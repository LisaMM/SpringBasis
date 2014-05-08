package be.vdab.services;

import java.util.Collection;

public interface NamenService {
	void opslaan(Collection<String> namen);
	int getAantalOpgeslagenNamen();
}
