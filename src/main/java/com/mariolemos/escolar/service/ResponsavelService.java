package com.mariolemos.escolar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.ResponsavelRepository;
import com.mariolemos.escolar.dominio.Responsavel;

@Service
public class ResponsavelService {
	
	@Autowired
	private ResponsavelRepository repo;
	
	public Responsavel insert(Responsavel obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Responsavel buscar(Integer id) {
		Optional<Responsavel> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Responsavel update(Responsavel obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
