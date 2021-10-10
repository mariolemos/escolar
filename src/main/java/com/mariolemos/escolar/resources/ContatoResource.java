package com.mariolemos.escolar.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.escolar.dominio.Contato;
import com.mariolemos.escolar.service.ContatoService;

@RestController
@RequestMapping(value="/contatos")
public class ContatoResource {
	
	@Autowired
	private ContatoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		Contato obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
	}
	
	@RequestMapping(value="/contatos", method = RequestMethod.GET)
	public ResponseEntity<List<Contato>> buscarTodos() {
		List<Contato> obj = service.buscarTodos();
		return ResponseEntity.ok().body(obj);		
	}
}
