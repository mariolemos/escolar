package com.mariolemos.escolar.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private String modelo;
	private int capacidade;
	private String placa;
	private String alvara;
	
	@ManyToMany
	@JoinTable(name = "VEICULO_CONDUTOR", joinColumns = @JoinColumn(name="veiculo_id"), inverseJoinColumns = @JoinColumn(name="condutor_id"))
	private List<Condutor> condutores = new ArrayList<>();
	
	public Veiculo() {
		
	}
	
	public Veiculo (Integer id, String marca, String modelo, int capacidade, String placa, String alvara){
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.placa = placa;
		this.alvara = alvara;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAlvara() {
		return alvara;
	}

	public void setAlvara(String alvara) {
		this.alvara = alvara;
	}
	
	public List<Condutor> getCondutores() {
		return condutores;
	}

	public void setCondutores(List<Condutor> condutores) {
		this.condutores = condutores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
