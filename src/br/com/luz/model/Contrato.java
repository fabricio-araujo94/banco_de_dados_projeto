package br.com.luz.model;

import java.sql.Timestamp;

public class Contrato extends GenericModel {
	String descricao;
	Timestamp data_inicio;
	Timestamp data_criacao;
	int medidor_id;
	int classe_id;
	int cliente_id;
	
	public Contrato(Integer id, String descricao, Timestamp data_inicio, Timestamp data_criacao, int medidor_id, int classe_id,
			int cliente_id) {
		super.setId(id);;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_criacao = data_criacao;
		this.medidor_id = medidor_id;
		this.classe_id = classe_id;
		this.cliente_id = cliente_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Timestamp getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Timestamp data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Timestamp getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Timestamp data_criacao) {
		this.data_criacao = data_criacao;
	}

	public int getMedidor_id() {
		return medidor_id;
	}

	public void setMedidor_id(int medidor_id) {
		this.medidor_id = medidor_id;
	}

	public int getClasse_id() {
		return classe_id;
	}

	public void setClasse_id(int classe_id) {
		this.classe_id = classe_id;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	
	
	
	
}
