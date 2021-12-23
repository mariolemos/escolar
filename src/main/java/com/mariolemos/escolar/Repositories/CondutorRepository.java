package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariolemos.escolar.dominio.Condutor;

public interface CondutorRepository extends JpaRepository<Condutor, Integer> {

}
