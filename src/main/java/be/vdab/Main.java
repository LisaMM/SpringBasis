package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Spring container configuratie begint.");
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/container.xml")) {
			ClassA objectA = context.getBean(ClassA.class);
			System.out.println(objectA.getWebMasterEMailAdres());
			System.out.println(objectA.getWebSiteGestart());
		}
	}
}
