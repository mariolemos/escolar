
package com.mariolemos.escolar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.AlunoRepository;
import com.mariolemos.escolar.Repositories.CondutorRepository;
import com.mariolemos.escolar.Repositories.PessoaRepository;
import com.mariolemos.escolar.Repositories.ResponsavelRepository;
import com.mariolemos.escolar.dominio.Aluno;
import com.mariolemos.escolar.dominio.Condutor;
import com.mariolemos.escolar.dominio.Pessoa;
import com.mariolemos.escolar.dominio.Responsavel;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private ResponsavelRepository responsavelRepository;
	@Autowired
	private CondutorRepository condutorRepository;
	
	
	public Pessoa inserir(Pessoa obj) {
		obj.setId(null);		
		return pessoaRepository.save(obj);
	}
	
	public Aluno inserir(Aluno obj) {
		obj.setId(null);		
		return alunoRepository.save(obj);
	}
	
	public Responsavel inserir(Responsavel obj) {
		obj.setId(null);		
		return responsavelRepository.save(obj);
	}
	public Condutor inserir(Condutor obj) {
		obj.setId(null);		
		return condutorRepository.save(obj);
	}
			
	public Pessoa buscarPorId(Integer id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return pessoa.orElse(null);
	}
	
	public List<Pessoa> buscarTodos(){
		List<Pessoa> pessoas = pessoaRepository.findAll();
		return pessoas;
	}
			
	public Pessoa atualiza(Pessoa obj) {
		//obj.setId(null);
		return pessoaRepository.save(obj);
	}
}
