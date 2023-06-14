package br.com.luz.model;

import java.util.Calendar;

public class Tarefa_rota extends GenericModel {
	String observacao;
	Calendar data_inicio;
	Calendar data_fim;
	Rota rota;
	
	
	public Tarefa_rota(Integer id, String observacao, Calendar data_inicio, Calendar data_fim, Rota rota) {
		super.setId(id);;
		this.observacao = observacao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.rota = rota;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Calendar getData_inicio() {
		return data_inicio;
	}


	public void setData_inicio(Calendar data_inicio) {
		this.data_inicio = data_inicio;
	}


	public Calendar getData_fim() {
		return data_fim;
	}


	public void setData_fim(Calendar data_fim) {
		this.data_fim = data_fim;
	}


	public Rota getRota() {
		return rota;
	}


	public void setRota(Rota rota) {
		this.rota = rota;
	}
	
	
}
