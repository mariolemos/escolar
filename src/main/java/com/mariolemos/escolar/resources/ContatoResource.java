package com.mariolemos.escolar.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.escolar.dominio.Contato;

@RestController
@RequestMapping(value="/contatos")
public class ContatoResource {
	@RequestMapping(method = RequestMethod.GET)
	public List<Contato>listar() {
		
		Contato cont1 = new Contato(1, "71988322598", "Telefone");
		Contato cont2 = new Contato(2, "lemosmm@bol.com.br", "e-mail");
		
		List<Contato> lista = new ArrayList<>();
		lista.add(cont1);
		lista.add(cont2);
		
		return lista;
	}
	
}
