package com.cg.bta.busapplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bta.busapplication.model.BusDetails;

@Repository
@Transactional
public class BusDAOImpl implements IBusDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addBusDetails(BusDetails busDetails) {
		entityManager.persist(busDetails);
	}
}
