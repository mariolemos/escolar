package com.mariolemos.escolar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.AlunoRepository;
import com.mariolemos.escolar.dominio.Aluno;
import com.mariolemos.escolar.dominio.Contato;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repo;
	
	
	public Aluno Buscar(Integer id) {
		Optional<Aluno> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	
	public Aluno insert(Aluno obj) {
		obj.setId(null);
		for(Contato contato: obj.getContatos()) {
			contato.setPessoa(obj);			
		}
		return repo.save(obj);
	}
	
	public Aluno update(Aluno obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
