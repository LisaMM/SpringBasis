package be.vdab.services;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import be.vdab.Persoon;
import be.vdab.dao.PersoonDAO;

@Service("persoonService")
public class PersoonServiceImpl implements PersoonService {
	private final PersoonDAO persoonDAO;
	
	@Autowired
	public PersoonServiceImpl (@Qualifier("CVSFormaat") PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}

	@Override
	public Iterable<Persoon> findAll() {
		return persoonDAO.findAll();
	}

}
