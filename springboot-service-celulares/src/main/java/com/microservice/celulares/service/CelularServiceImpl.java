package com.microservice.celulares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.celulares.entity.Celular;
import com.microservice.celulares.repository.CelularDao;


@Service
public class CelularServiceImpl implements CelularService {

	
	@Autowired
	private CelularDao celularDao;
	
	@Override
	public List<Celular> findAll() {
		// TODO Auto-generated method stub
		return (List<Celular>) celularDao.findAll();
	}

	@Override
	public Celular findById(Long id) {
		// TODO Auto-generated method stub
		return celularDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		celularDao.deleteById(id);

	}

	@Override
	public Celular save(Celular instance) {
		// TODO Auto-generated method stub
		return celularDao.save(instance);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return celularDao.existsById(id);
	}

}
