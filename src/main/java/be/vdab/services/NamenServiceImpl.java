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
		namenDAO.opslaan(namen);
	}

	@Override
	public int getAantalOpgeslagenNamen() {
		return namenDAO.getAantalOpgeslagenNamen();
	}
}
