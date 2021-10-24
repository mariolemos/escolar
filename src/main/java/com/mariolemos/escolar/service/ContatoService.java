package com.mariolemos.escolar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.ContatoRepository;
import com.mariolemos.escolar.dominio.Contato;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repo;
	
	public Contato buscar(Integer id) {
		Optional<Contato> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	public List<Contato> buscarTodos() {		
		return repo.findAll();		
	}

}
