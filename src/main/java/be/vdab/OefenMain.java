package be.vdab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.presentations.PersoonViewer;

public class OefenMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
			"spring/dao.xml", "spring/services.xml", "spring/presentation.xml");
		PersoonViewer viewer = context.getBean(PersoonViewer.class);
		viewer.afbeelden();
	}
}
