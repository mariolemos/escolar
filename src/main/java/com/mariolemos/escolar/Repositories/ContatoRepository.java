package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariolemos.escolar.dominio.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
