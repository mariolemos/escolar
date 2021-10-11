package com.mariolemos.escolar.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.escolar.dominio.Colegio;
import com.mariolemos.escolar.service.ColegioService;

@RestController
@RequestMapping(value="/colegios")
public class ColegioResource {
	
	@Autowired
	private ColegioService service;
	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id){
		Colegio obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
