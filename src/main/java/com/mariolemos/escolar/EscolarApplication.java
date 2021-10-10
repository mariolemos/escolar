package com.mariolemos.escolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mariolemos.escolar.Repositories.ColegioRepository;
import com.mariolemos.escolar.Repositories.ContatoRepository;
import com.mariolemos.escolar.dominio.Colegio;
import com.mariolemos.escolar.dominio.Contato;

@SpringBootApplication
public class EscolarApplication implements CommandLineRunner {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private ColegioRepository colegioRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Contato cont1 = new Contato(null, "988322598", "Telefone");
		Contato cont2 = new Contato(null, "lemosmm@bol.com.br", "E-mail");
		Contato cont3 = new Contato(null, "mariolemos64", "Instagram");
		
		Colegio cole1 = new Colegio(null, "CPM Dendezeiros", 7);
		Colegio cole2 = new Colegio(null, "CPM Luiz Tarqu7inio", 8);
		Colegio cole3 = new Colegio(null, "CPM Lobato", 8);
		
		cont1.getColegios().addAll(Arrays.asList(cole2));
		cont2.getColegios().addAll(Arrays.asList(cole3));
		cont3.getColegios().addAll(Arrays.asList(cole1));
		
		cole1.getContatos().addAll(Arrays.asList(cont3));
		cole2.getContatos().addAll(Arrays.asList(cont1));
		cole3.getContatos().addAll(Arrays.asList(cont2));		
		
		contatoRepository.saveAll(Arrays.asList(cont1, cont2, cont3));
		colegioRepository.saveAll(Arrays.asList(cole1, cole2, cole3));
		
		
		
		
	}

}
