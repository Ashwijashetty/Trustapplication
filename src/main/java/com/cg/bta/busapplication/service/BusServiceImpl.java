package com.cg.bta.busapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bta.busapplication.dao.IBusDAO;
import com.cg.bta.busapplication.model.BusDetails;

@Service
public class BusServiceImpl implements IBusService {

	@Autowired
	IBusDAO busDao;

	@Override
	public void addBusDetails(BusDetails busDetails) {
		busDao.addBusDetails(busDetails);

	}

}
