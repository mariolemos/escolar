package com.mariolemos.escolar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.PessoaRepository;
import com.mariolemos.escolar.dominio.Pessoa;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> buscarTodos(){
		List<Pessoa> pessoas = pessoaRepository.findAll();
		return pessoas;
	}
	
	public Pessoa buscarPorId(Integer id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return pessoa.orElse(null);
	}
	
}
