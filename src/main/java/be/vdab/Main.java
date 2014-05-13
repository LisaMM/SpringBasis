package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Spring container configuratie begint.");
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/container.xml")) {
			Spelletje spel = context.getBean(Spelletje.class);
			System.out.println(spel.getAantalVijanden());
		}
	}
}
