package com.mariolemos.escolar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.ColegioRepository;
import com.mariolemos.escolar.dominio.Colegio;

@Service
public class ColegioService {
	
	@Autowired
	private ColegioRepository repo;
	
	public Colegio inserir(Colegio obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Colegio buscar(Integer id) {
		Optional<Colegio> obj = repo.findById(id);		
		return obj.orElse(null);
	}
	
	public Colegio update(Colegio obj) {
		return repo.save(obj);
		
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
