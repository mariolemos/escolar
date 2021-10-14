package com.mariolemos.escolar;

import java.text.SimpleDateFormat;
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
import com.mariolemos.escolar.Repositories.PessoaRepository;
import com.mariolemos.escolar.dominio.Cidade;
import com.mariolemos.escolar.dominio.Colegio;
import com.mariolemos.escolar.dominio.Contato;
import com.mariolemos.escolar.dominio.Endereco;
import com.mariolemos.escolar.dominio.Estado;
import com.mariolemos.escolar.dominio.Pessoa;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);		
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public void run(String... args) throws Exception {		
		
		
		Contato cont1 = new Contato(null, "988322598", "Telefone");
		Contato cont2 = new Contato(null, "lemosmm@bol.com.br", "E-mail");
		Contato cont3 = new Contato(null, "mariolemos64", "Instagram");
		
		Estado est1 = new Estado(null,"Bahia");
		
		Cidade cid1 = new Cidade(null, "Salvador", est1);
		
	
		est1.setCidades(Arrays.asList(cid1));
		
		Pessoa pess1 = new Pessoa(null, "Mário Lemos", sdf.parse("15/03/1964") , "28560043500", "01819077-47");
		Pessoa pess2 = new Pessoa(null, "Wagner Lemos", sdf.parse("01/06/1994") , "85806128539", "1432704354");
		Pessoa pess3 = new Pessoa(null, "Aline Lemos", sdf.parse("26/05/1991") , "28560043500", "01819077-47");
		
		
		Endereco end1 =new Endereco(null, "Av. Dendezeiros", "150", "Casa", "Bomfim", "41150-115", cid1, pess1);
		Endereco end2 =new Endereco(null, "Av. Luiz Tarquinio", "1150", "casa", "Boa Viagem", "41150-100", cid1, pess2);
		Endereco end3 =new Endereco(null, "Rua Dom Bosco", "10", "Casa", "Lobato", "41150-015", cid1, pess3);
		
		Colegio cole1 = new Colegio(null, "CPM Dendezeiros", 7, end1);
		Colegio cole2 = new Colegio(null, "CPM Luiz Tarqu7inio", 8, end2);
		Colegio cole3 = new Colegio(null, "CPM Lobato", 8, end3);
		
		pess1.setEnderecos(Arrays.asList(end1));
		pess2.setEnderecos(Arrays.asList(end2));
		pess3.setEnderecos(Arrays.asList(end3));
		
	
		cont1.getColegios().addAll(Arrays.asList(cole2));
		cont2.getColegios().addAll(Arrays.asList(cole3));
		cont3.getColegios().addAll(Arrays.asList(cole1));
		
		cole1.getContatos().addAll(Arrays.asList(cont3));
		cole2.getContatos().addAll(Arrays.asList(cont1));
		cole3.getContatos().addAll(Arrays.asList(cont2));	

		
		contatoRepository.saveAll(Arrays.asList(cont1, cont2, cont3));		
		estadoRepository.saveAll(Arrays.asList(est1));
		//cidadeRepository.save(cid1);
		pessoaRepository.saveAll(Arrays.asList(pess1, pess2, pess3));
		//enderecoRepository.saveAll(Arrays.asList(end1,end2,end3));
		//colegioRepository.saveAll(Arrays.asList(cole1, cole2, cole3));		
						
	}

}
