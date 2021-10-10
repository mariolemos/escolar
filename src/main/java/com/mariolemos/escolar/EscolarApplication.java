package com.mariolemos.escolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mariolemos.escolar.Repositories.ContatoRepository;
import com.mariolemos.escolar.dominio.Contato;

@SpringBootApplication
public class EscolarApplication implements CommandLineRunner {
	
	@Autowired
	private ContatoRepository contatoRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Contato cont1 = new Contato(null, "988322598", "Telefone");
		Contato cont2 = new Contato(null, "lemosmm@bol.com.br", "E-mail");
		Contato cont3 = new Contato(null, "mariolemos64", "Instagram");
		
		contatoRepository.saveAll(Arrays.asList(cont1, cont2, cont3));
		
		
	}

}
