package com.gibisboard.serviceImpl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gibisboard.dao.Dao;
import com.gibisboard.entity.GIBIS_MR_M;
import com.gibisboard.serviceInterface.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface{
	
	private final Dao dao;
	
	@Autowired
	public ServiceImpl(Dao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<GIBIS_MR_M>findAll() throws SQLException {
		return dao.findAll();
	}
	
}
