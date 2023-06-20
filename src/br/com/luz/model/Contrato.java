package br.com.luz.model;

import java.sql.Timestamp;

public class Contrato extends GenericModel {
	String descricao;
	Timestamp dataInicio;
	Timestamp dataCriacao;
	int medidorId;
	int classeId;
	int clienteId;
	
	public Contrato(Integer id, String descricao, Timestamp dataInicio, Timestamp dataCriacao, int medidorId, int classeId,
			int clienteId) {
		super.setId(id);
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataCriacao = dataCriacao;
		this.medidorId = medidorId;
		this.classeId = classeId;
		this.clienteId = clienteId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Timestamp getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Timestamp dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Timestamp getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Timestamp dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public int getMedidorId() {
		return medidorId;
	}

	public void setMedidorId(int medidorId) {
		this.medidorId = medidorId;
	}

	public int getClasseId() {
		return classeId;
	}

	public void setClasseId(int classeId) {
		this.classeId = classeId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	
	
}
