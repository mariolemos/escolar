package com.mariolemos.escolar.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Condutor extends Pessoa {		
	private static final long serialVersionUID = 1L;
	
	private int cnh;
	private String categoria;
	
	@ManyToMany(mappedBy = "condutores")
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Condutor() {
		
	}

	public Condutor(Integer id, String nome, Date dtNascimento, String cpf, String rg, String senha, String login, int cnh, String categoria) {
		super(id, nome, dtNascimento, cpf, rg, senha, login);
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

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
		
}
