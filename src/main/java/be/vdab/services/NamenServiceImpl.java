package be.vdab.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import be.vdab.dao.NamenDAO;

@Service("namenService")
class NamenServiceImpl implements NamenService {
	private NamenDAO namenDAO;
	
	@Autowired
	public void setNamenDAO(@Qualifier("XMLFormaat") NamenDAO namenDAO) {
		this.namenDAO = namenDAO;
	}

	@Override
	public void opslaan(Collection<String> namen) {
		System.out.println("begin opslaan");
		namenDAO.opslaan(namen);
		System.out.println("einde opslaan");
	}

	@Override
	public int getAantalOpgeslagenNamen() {
		System.out.println("begin getAantalOpgeslagenNamen");
		int aantalOpgeslagenNamen = namenDAO.getAantalOpgeslagenNamen();
		System.out.println("einde getAantalOpgeslagenNamen");
		return aantalOpgeslagenNamen;
	}
}
