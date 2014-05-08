package be.vdab.services;

import java.util.Collection;

import be.vdab.dao.NamenDAO;

public class NamenServiceImpl implements NamenService {
	private NamenDAO namenDAO;
	
	public NamenServiceImpl(NamenDAO namenDAO) {
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
