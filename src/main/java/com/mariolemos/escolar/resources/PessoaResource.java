package com.mariolemos.escolar.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.escolar.dominio.Pessoa;
import com.mariolemos.escolar.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> buscarTodos(){
		List<Pessoa> pessoas = pessoaService.buscarTodos();
		return ResponseEntity.ok().body(pessoas);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Integer id){
		Pessoa pessoa = pessoaService.buscarPorId(id);
		return ResponseEntity.ok().body(pessoa);
	}
	
}
