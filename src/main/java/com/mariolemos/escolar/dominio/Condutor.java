package com.mariolemos.escolar.dominio;

import java.util.Date;

public class Condutor extends Pessoa {		
	private static final long serialVersionUID = 1L;
	
	private int cnh;
	private String categoria;
	
	public Condutor() {
		
	}

	public Condutor(Integer id, String nome, Date dtNascimento, String cpf, String rg, int cnh, String categoria) {
		super(id, nome, dtNascimento, cpf, rg);
		this.cnh = cnh;
		this.categoria = categoria;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
		
}
