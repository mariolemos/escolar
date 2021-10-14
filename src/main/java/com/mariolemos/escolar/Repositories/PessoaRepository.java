package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariolemos.escolar.dominio.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
