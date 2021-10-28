package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariolemos.escolar.dominio.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
