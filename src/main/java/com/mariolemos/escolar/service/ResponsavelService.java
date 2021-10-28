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
	
	public Responsavel buscar(Integer id) {
		Optional<Responsavel> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
