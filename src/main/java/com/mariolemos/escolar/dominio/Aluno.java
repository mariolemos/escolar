package com.mariolemos.escolar.dominio;

import java.util.Date;

public class Aluno extends Pessoa{
	private static final long serialVersionUID = 1L;
	
	private String turno;
	private String serie;
	private String turma;
	private boolean rota;
	private String pai;
	private String mae;
	private String convMedico;
	
	public Aluno() {
		
	}

	public Aluno(Integer id, String nome, Date dtNascimento, String cpf, String rg, String turno, String serie, String turma, boolean rota, String pai, String mae, String convMedico) {
		super(id, nome, dtNascimento, cpf, rg);
		this.turno = turno;
		this.serie = serie;
		this.turma = turma;
		this.rota = rota;
		this.pai = pai;
		this.mae = mae;
		this.convMedico = convMedico;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public boolean isRota() {
		return rota;
	}

	public void setRota(boolean rota) {
		this.rota = rota;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getConvMedico() {
		return convMedico;
	}

	public void setConvMedico(String convMedico) {
		this.convMedico = convMedico;
	}
	
	
	

}
