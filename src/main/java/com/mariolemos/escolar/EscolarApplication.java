package com.mariolemos.escolar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mariolemos.escolar.Repositories.CidadeRepository;
import com.mariolemos.escolar.Repositories.ColegioRepository;
import com.mariolemos.escolar.Repositories.ContatoRepository;
import com.mariolemos.escolar.Repositories.EnderecoRepository;
import com.mariolemos.escolar.Repositories.EstadoRepository;
import com.mariolemos.escolar.dominio.Cidade;
import com.mariolemos.escolar.dominio.Colegio;
import com.mariolemos.escolar.dominio.Contato;
import com.mariolemos.escolar.dominio.Endereco;
import com.mariolemos.escolar.dominio.Estado;

@SpringBootApplication
public class EscolarApplication implements CommandLineRunner {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private ColegioRepository colegioRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired  
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Contato cont1 = new Contato(null, "988322598", "Telefone");
		Contato cont2 = new Contato(null, "lemosmm@bol.com.br", "E-mail");
		Contato cont3 = new Contato(null, "mariolemos64", "Instagram");
		
		Estado est1 = new Estado(null,"Bahia");
		
		Cidade cid1 = new Cidade(null, "Salvador", est1);
		
		Endereco end1 =new Endereco(null, "Av. Dendezeiros", "150", "Casa", "Bomfim", "41150-115", cid1);
		Endereco end2 =new Endereco(null, "Av. Luiz Tarquinio", "1150", "casa", "Boa Viagem", "41150-100", cid1);
		Endereco end3 =new Endereco(null, "Rua Dom Bosco", "10", "Casa", "Lobato", "41150-015", cid1);
		
		Colegio cole1 = new Colegio(null, "CPM Dendezeiros", 7, end1);
		Colegio cole2 = new Colegio(null, "CPM Luiz Tarqu7inio", 8, end2);
		Colegio cole3 = new Colegio(null, "CPM Lobato", 8, end3);
		
		cont1.getColegios().addAll(Arrays.asList(cole2));
		cont2.getColegios().addAll(Arrays.asList(cole3));
		cont3.getColegios().addAll(Arrays.asList(cole1));
		
		cole1.getContatos().addAll(Arrays.asList(cont3));
		cole2.getContatos().addAll(Arrays.asList(cont1));
		cole3.getContatos().addAll(Arrays.asList(cont2));		
		
		contatoRepository.saveAll(Arrays.asList(cont1, cont2, cont3));		
		estadoRepository.saveAll(Arrays.asList(est1));
		cidadeRepository.save(cid1);
		enderecoRepository.saveAll(Arrays.asList(end1,end2,end3));
		colegioRepository.saveAll(Arrays.asList(cole1, cole2, cole3));
							
	}

}
