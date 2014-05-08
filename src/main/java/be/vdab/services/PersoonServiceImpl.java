package be.vdab.services;

import be.vdab.Persoon;
import be.vdab.dao.PersoonDAO;

public class PersoonServiceImpl implements PersoonService {
	private final PersoonDAO persoonDAO;
	
	public PersoonServiceImpl (PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}

	@Override
	public Iterable<Persoon> findAll() {
		return persoonDAO.findAll();
	}

}
