package be.vdab.dao;

import java.io.*;
import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

@Repository("namenDAOTXT")
@Qualifier("TXTFormaat")
class NamenDAOTXT implements NamenDAO {
	private File bestand;

	@Value("${namenTXT}")
	public void setBestand(File bestand) {
		this.bestand = bestand;
	}

	@Override
	public void opslaan(Collection<String> namen) {
		try (PrintStream stream = new PrintStream(bestand)) {
			for (String naam : namen) {
				stream.println(naam);
			}
		} catch (IOException ex) {
			throw new NamenDAOException(ex);
		}
	}

	@Override
	public int getAantalOpgeslagenNamen() {
		if (!bestand.exists()) {
			return 0;
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(bestand))) {
			int aantalRegels = 0;
			while (reader.readLine() != null) {
				aantalRegels++;
			}
			return aantalRegels;
		} catch (IOException ex) {
			throw new NamenDAOException(ex);
		}
	}
}
