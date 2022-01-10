package com.mariolemos.escolar;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mariolemos.escolar.Repositories.ColegioRepository;
import com.mariolemos.escolar.Repositories.EstadoRepository;
import com.mariolemos.escolar.Repositories.PessoaRepository;
import com.mariolemos.escolar.dominio.Aluno;
import com.mariolemos.escolar.dominio.Cidade;
import com.mariolemos.escolar.dominio.Colegio;
import com.mariolemos.escolar.dominio.Contato;
import com.mariolemos.escolar.dominio.Endereco;
import com.mariolemos.escolar.dominio.Estado;
import com.mariolemos.escolar.dominio.Pessoa;
import com.mariolemos.escolar.dominio.Responsavel;

@SpringBootApplication
public class EscolarApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(EscolarApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		
	}

}
