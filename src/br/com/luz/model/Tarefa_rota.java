package br.com.luz.model;

import java.sql.Timestamp;

public class Tarefa_rota extends GenericModel {
	String observacao;
	Timestamp data_inicio;
	Timestamp data_fim;
	int rota_id;
	
	
	public Tarefa_rota(Integer id, String observacao, Timestamp data_inicio, Timestamp data_fim, int rota_id) {
		super.setId(id);
		this.observacao = observacao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.rota_id = rota_id;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Timestamp getData_inicio() {
		return data_inicio;
	}


	public void setData_inicio(Timestamp data_inicio) {
		this.data_inicio = data_inicio;
	}


	public Timestamp getData_fim() {
		return data_fim;
	}


	public void setData_fim(Timestamp data_fim) {
		this.data_fim = data_fim;
	}


	public int getRota_id() {
		return rota_id;
	}


	public void setRota_id(int rota_id) {
		this.rota_id = rota_id;
	}
	
	
}
