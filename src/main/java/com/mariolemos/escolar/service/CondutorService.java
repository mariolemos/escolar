package com.mariolemos.escolar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.CondutorRepository;
import com.mariolemos.escolar.dominio.Condutor;

@Service
public class CondutorService {
	
	@Autowired
	public CondutorRepository repo;
	
	public Condutor insert(Condutor obj) {
		obj.setId(null);
		return repo.save(obj);		
	}
	
	public Condutor listar(Integer id) {
		Optional<Condutor> obj =  repo.findById(id);
		return obj.orElseThrow(null);
		
	}
	
	public List<Condutor> listarTodos() {
		return repo.findAll();
	}	
	
	public Condutor update(Condutor obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
