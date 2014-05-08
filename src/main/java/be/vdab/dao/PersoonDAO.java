package be.vdab.dao;

import be.vdab.Persoon;

public interface PersoonDAO {
	Iterable<Persoon> findAll();
}
