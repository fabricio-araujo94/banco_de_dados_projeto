package br.com.luz.model;

import java.sql.Timestamp;

public class TarefaRota extends GenericModel {
	String observacao;
	Timestamp dataInicio;
	Timestamp dataFim;
	int rotaId;
	
	
	public TarefaRota(Integer id, String observacao, Timestamp dataInicio, Timestamp dataFim, int rotaId) {
		super.setId(id);
		this.observacao = observacao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.rotaId = rotaId;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Timestamp getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Timestamp dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Timestamp getDataFim() {
		return dataFim;
	}


	public void setDataFim(Timestamp dataFim) {
		this.dataFim = dataFim;
	}


	public int getRotaId() {
		return rotaId;
	}


	public void setRotaId(int rotaId) {
		this.rotaId = rotaId;
	}


	@Override
	public String toString() {
		return "TarefaRota [observacao=" + observacao + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", rotaId=" + rotaId + ", getId()=" + this.getId() + "]";
	}

	
}
