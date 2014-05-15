package be.vdab;

import java.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.dao.NamenDAOException;
import be.vdab.services.NamenService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Spring container configuratie begint.");
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/dao.xml", "spring/services.xml", "spring/advice.xml")) {
			List<String> namen = new ArrayList<>();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"Tik de namen, gescheiden door Enter. Tik stop na de laatste naam.");
			for (String naam; ! "stop".equals(naam = scanner.nextLine());) {
				namen.add(naam);
			}
			NamenService namenService = context.getBean(NamenService.class);
			System.out.println("main roept opslaan op");
			try {
				namenService.opslaan(namen);
			} catch (NamenDAOException ex) {
				System.out.println("Probleem bij opslaan");
			}
			System.out.println("terug in main");
			System.out.println("main roept getAantalOpgeslagenNamen op");
			try {
				int aantalNamen = namenService.getAantalOpgeslagenNamen();
				System.out.printf("Terug in main,  aantal namen:%d\n", aantalNamen);
			} catch (NamenDAOException ex) {
				System.out.println("Probleem bij lezen namen");
			}
		}
	}
}
