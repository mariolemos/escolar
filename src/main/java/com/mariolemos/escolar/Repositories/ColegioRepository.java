package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariolemos.escolar.dominio.Colegio;

public interface ColegioRepository extends JpaRepository<Colegio, Integer> {

}
