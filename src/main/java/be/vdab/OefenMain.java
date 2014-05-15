package be.vdab;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.aspects.Statistiek;
import be.vdab.presentations.PersoonViewer;

public class OefenMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/dao.xml", " spring/services.xml",
						"spring/presentation.xml", "spring/advice.xml" });
		PersoonViewer persoonViewer = context.getBean(PersoonViewer.class);
		persoonViewer.afbeelden(); // eerste oproep die service layer passeert
		System.out.println();
		persoonViewer.afbeelden(); // tweede oproep die service layer passeert
		System.out.println();
		Statistiek statistiek = context.getBean(Statistiek.class);
		for (Map.Entry<String, Integer> entry : statistiek.getStatistiek()
				.entrySet()) {
			System.out.println(entry.getKey() + ':' + entry.getValue());
		}
	}
}
