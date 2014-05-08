package be.vdab;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.util.*;

public class ClassA implements InterfaceA {
	private String telefoonNrHelpdesk;
	private int aantalPogingenUpdateKlant;
	private BigDecimal maxTemperatuurMotor;
	private URL urlKoersenVreemdeMuntenTOVEuro;
	private Locale defaultTaalEnLandVanDeApplicatie;
	private File bestandMetTeImporterenData;
	private BladRichtingInPrinter standaardBladRichtingInPrinter;
	private EMailAdres webMasterEMailAdres;
	private Date webSiteGestart;
	
	@Override
	public String getBoodschap() {
		return "Ik ben een ClassA object";
	}

	public String getTelefoonNrHelpdesk() {
		return telefoonNrHelpdesk;
	}

	public void setTelefoonNrHelpdesk(String telefoonNrHelpdesk) {
		this.telefoonNrHelpdesk = telefoonNrHelpdesk;
	}

	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}

	public void setAantalPogingenUpdateKlant(int aantalPogingenUpdateKlant) {
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
	}

	public BigDecimal getMaxTemperatuurMotor() {
		return maxTemperatuurMotor;
	}

	public void setMaxTemperatuurMotor(BigDecimal maxTemperatuurMotor) {
		this.maxTemperatuurMotor = maxTemperatuurMotor;
	}

	public URL getUrlKoersenVreemdeMuntenTOVEuro() {
		return urlKoersenVreemdeMuntenTOVEuro;
	}

	public void setUrlKoersenVreemdeMuntenTOVEuro(
			URL urlKoersenVreemdeMuntenTOVEuro) {
		this.urlKoersenVreemdeMuntenTOVEuro = urlKoersenVreemdeMuntenTOVEuro;
	}

	public Locale getDefaultTaalEnLandVanDeApplicatie() {
		return defaultTaalEnLandVanDeApplicatie;
	}

	public void setDefaultTaalEnLandVanDeApplicatie(
			Locale defaultTaalEnLandVanDeApplicatie) {
		this.defaultTaalEnLandVanDeApplicatie = defaultTaalEnLandVanDeApplicatie;
	}

	public BladRichtingInPrinter getStandaardBladRichtingInPrinter() {
		return standaardBladRichtingInPrinter;
	}

	public void setStandaardBladRichtingInPrinter(
			BladRichtingInPrinter standaardBladRichtingInPrinter) {
		this.standaardBladRichtingInPrinter = standaardBladRichtingInPrinter;
	}

	public File getBestandMetTeImporterenData() {
		return bestandMetTeImporterenData;
	}

	public void setBestandMetTeImporterenData(File bestandMetTeImporterenData) {
		this.bestandMetTeImporterenData = bestandMetTeImporterenData;
	}

	public EMailAdres getWebMasterEMailAdres() {
		return webMasterEMailAdres;
	}

	public void setWebMasterEMailAdres(EMailAdres webMasterEMailAdres) {
		this.webMasterEMailAdres = webMasterEMailAdres;
	}

	public Date getWebSiteGestart() {
		return webSiteGestart;
	}

	public void setWebSiteGestart(Date webSiteGestart) {
		this.webSiteGestart = webSiteGestart;
	}
}
