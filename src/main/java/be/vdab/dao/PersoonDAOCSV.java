package be.vdab.dao;

import java.io.*;
import java.util.*;

import be.vdab.Persoon;

public class PersoonDAOCSV implements PersoonDAO {
	private File bestand;

	public PersoonDAOCSV(File bestand) {
		this.bestand = bestand;
	}

	@Override
	public Iterable<Persoon> findAll() {
		List<Persoon> personen = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(bestand))) {
			for (String regel; (regel = reader.readLine()) != null;) {
				String[] onderdelen = regel.split(",");
				personen.add(new Persoon(Integer.parseInt(onderdelen[0]),
						onderdelen[1], onderdelen[2], Integer
								.parseInt(onderdelen[3])));
			}
		} catch (IOException ex) {
			throw new NamenDAOException(ex);
		}
		return personen;
	}

}
