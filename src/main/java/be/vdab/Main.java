package be.vdab;

import java.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.services.NamenService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Spring container configuratie begint.");
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/container.xml")) {
			List<String> namen = new ArrayList<>();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"Tik de namen, gescheiden door Enter. Tik stop na de laatste naam");
			for (String naam; !"stop".equals(naam = scanner.nextLine());) {
				namen.add(naam);
			}
			NamenService namenService = context.getBean(NamenService.class);
			namenService.opslaan(namen);
		}
	}
}
