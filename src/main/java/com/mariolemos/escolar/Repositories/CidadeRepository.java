package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariolemos.escolar.dominio.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
