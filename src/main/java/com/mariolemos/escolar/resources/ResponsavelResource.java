package com.mariolemos.escolar.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.escolar.dominio.Responsavel;
import com.mariolemos.escolar.service.ResponsavelService;

@RestController
@RequestMapping(value = "/responsaveis")
public class ResponsavelResource {
	
	@Autowired
	private ResponsavelService service;
	
	@RequestMapping(value = "/{id}")
	public ResponseEntity<Responsavel> buscar(@PathVariable Integer id){
		Responsavel obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
