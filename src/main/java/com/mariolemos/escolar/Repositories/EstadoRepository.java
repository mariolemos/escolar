package com.mariolemos.escolar.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariolemos.escolar.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
