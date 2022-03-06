package com.mariolemos.escolar.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.escolar.dominio.Aluno;
import com.mariolemos.escolar.dominio.Condutor;
import com.mariolemos.escolar.dominio.Pessoa;
import com.mariolemos.escolar.dominio.Responsavel;
import com.mariolemos.escolar.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Pessoa> inserir(@RequestBody Pessoa obj) {
		obj = pessoaService.inserir(obj);
		return ResponseEntity.ok().body(obj);		
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value= "/condutor", method = RequestMethod.POST)
	public ResponseEntity<Condutor> inserir(@RequestBody Condutor obj) {
		obj = pessoaService.inserir(obj);
		return ResponseEntity.ok().body(obj);		
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value= "/Aluno", method = RequestMethod.POST)
	public ResponseEntity<Pessoa> inserir(@RequestBody Aluno obj) {
		obj = pessoaService.inserir(obj);		
		return ResponseEntity.ok().body(obj);		
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value= "/Responsavel", method = RequestMethod.POST)
	public ResponseEntity<Pessoa> inserir(@RequestBody Responsavel obj) {
		obj = pessoaService.inserir(obj);		
		return ResponseEntity.ok().body(obj);		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Integer id){
		Pessoa pessoa = pessoaService.buscarPorId(id);
		return ResponseEntity.ok().body(pessoa);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> buscarTodos(){
		List<Pessoa> pessoas = pessoaService.buscarTodos();
		return ResponseEntity.ok().body(pessoas);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualiza(@RequestBody Pessoa obj, @PathVariable Integer id){
		obj.setId(id);
		obj = pessoaService.atualiza(obj);
		return ResponseEntity.noContent().build();
	}
	
}
