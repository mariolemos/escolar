package com.mariolemos.escolar.dominio;

import java.util.Date;

public class Responsavel extends Pessoa {	
	private static final long serialVersionUID = 1L;
	
	private String parentesco;
	
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

}
