package com.mariolemos.escolar.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Responsavel extends Pessoa {	
	private static final long serialVersionUID = 1L;
	
	private String parentesco;
	
	@JsonIgnore
	@OneToMany(mappedBy = "responsavel", cascade = CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<>();
	
	public Responsavel() {
		
	}

	public Responsavel(Integer id, String nome, Date dtNascimento, String cpf, String rg, String parentesco) {
		super(id, nome, dtNascimento, cpf, rg);
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}	
	

}
