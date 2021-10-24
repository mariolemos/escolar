package com.mariolemos.escolar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.AlunoRepository;
import com.mariolemos.escolar.dominio.Aluno;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repo;
	
	
	public Aluno Buscar(Integer id) {
		Optional<Aluno> obj = repo.findById(id);
		return obj.orElse(null);		
	}

}
