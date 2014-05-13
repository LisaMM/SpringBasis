package be.vdab.dao;

import java.io.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

import be.vdab.Persoon;

@Repository
@Qualifier("MeerdereRegelsFormaat")
public class PersoonDAOMeerdereRegels implements PersoonDAO {
	private File bestand;

	@Autowired
	public PersoonDAOMeerdereRegels(@Value("${personenDAOTXT}") File bestand) {
		this.bestand = bestand;
	}

	@Override
	public Iterable<Persoon> findAll() {
		List<Persoon> personen = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(bestand))) {
			for (String regel; (regel = reader.readLine()) != null;) {
				int persoonNr = Integer.parseInt(regel);
				String voornaam = reader.readLine();
				String familienaam = reader.readLine();
				int aantalKinderen = Integer.parseInt(reader.readLine());
				personen.add(new Persoon(persoonNr, voornaam, familienaam,
						aantalKinderen));
			}
		} catch (IOException ex) {
			throw new NamenDAOException(ex);
		}
		return personen;
	}

}
