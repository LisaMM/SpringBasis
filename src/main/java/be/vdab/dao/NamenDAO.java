package be.vdab.dao;

import java.util.Collection;

public interface NamenDAO {
	void opslaan(Collection<String> namen);
	int getAantalOpgeslagenNamen();
}
