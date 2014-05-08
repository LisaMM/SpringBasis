package be.vdab;

import java.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OefenMain {
	public static void main(String[] args) {
		Persoon persoon1 = new Persoon(1, "Tom", "Bracke", 3);
		Persoon persoon2 = new Persoon(2, "Els", "Amandelmelk", 5);
		Persoon persoon3 = new Persoon(3, "Karolien", "Van Mijn Melk", 18);
		Persoon persoon4 = new Persoon(4, "Eddy", "Wally", 1);
		Persoon persoon5 = new Persoon(5, "Willy", "Sommers", 2);
		List<Persoon> personen = new ArrayList<>();
		personen.add(persoon1);
		personen.add(persoon2);
		personen.add(persoon3);
		personen.add(persoon4);
		personen.add(persoon5);
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/container.xml")) {
			PersoonViewer viewer = context.getBean(PersoonViewer.class);
			viewer.afbeelden(personen);
		}
	}
}
