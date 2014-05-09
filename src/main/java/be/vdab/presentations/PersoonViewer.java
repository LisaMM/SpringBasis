package be.vdab.presentations;

import be.vdab.Persoon;
import be.vdab.PersoonEigenschappen;
import be.vdab.services.PersoonService;

public class PersoonViewer {
	private PersoonEigenschappen[] eigenschappen;
	private PersoonService persoonService;

	public PersoonViewer(PersoonService service, PersoonEigenschappen[] eigenschappen) {
		persoonService = service;
		this.eigenschappen = eigenschappen;
	}

	public void afbeelden() {
		Iterable<Persoon> personen = persoonService.findAll();
		for (Persoon persoon : personen) {
			for (PersoonEigenschappen eigenschap : eigenschappen) {
				toonEigenschap(persoon, eigenschap);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	private void toonEigenschap(Persoon persoon, PersoonEigenschappen eigenschap) {
		switch (eigenschap) {
		case PERSOON_NR:
			System.out.print(persoon.getPersoonNr());
			break;
		case VOORNAAM:
			System.out.print(persoon.getVoornaam());
			break;
		case FAMILIENAAM:
			System.out.print(persoon.getFamilienaam());
			break;
		case AANTAL_KINDEREN:
			System.out.print(persoon.getAantalKinderen());
			break;
		}
	}
}
