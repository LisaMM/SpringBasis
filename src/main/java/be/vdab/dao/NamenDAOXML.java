package be.vdab.dao;

import java.io.*;
import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

@Repository("namenDAOXML")
@Qualifier("XMLFormaat")
class NamenDAOXML implements NamenDAO {
	private File bestand;

	@Autowired
	public NamenDAOXML(@Value("${namenXML}") File bestand) {
		this.bestand = bestand;
	}

	public void setBestand(File bestand) {
		this.bestand = bestand;
	}

	@Override
	public void opslaan(Collection<String> namen) {
		try (PrintStream stream = new PrintStream(bestand, "UTF-8")) {
			stream.println("<namen>");
			for (String naam : namen) {
				stream.printf("\t<naam>%s</naam>\n", naam);
			}
			stream.println("</namen>");
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
			int aantalNamen = 0;
			for (String regel; (regel = reader.readLine()) != null;) {
				if (regel.contains("<naam>")) {
					aantalNamen++;
				}
			}
			return aantalNamen;
		} catch (IOException ex) {
			throw new NamenDAOException(ex);
		}
	}
}
