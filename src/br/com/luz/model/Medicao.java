package br.com.luz.model;

import java.sql.Timestamp;

public class Medicao extends GenericModel {
	String mes;
	String ano;
	Timestamp dataMedicao;
	String consumo;
	int medidorId;
	int timeRotaId;
	
	public Medicao(Integer id, String mes, String ano, Timestamp dataMedicao, String consumo, int medidorId, 
			int timeRotaId) {
		super.setId(id);
		this.mes = mes;
		this.ano = ano;
		this.dataMedicao = dataMedicao;
		this.consumo = consumo;
		this.medidorId = medidorId;
		this.timeRotaId = timeRotaId;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Timestamp getDataMedicao() {
		return dataMedicao;
	}

	public void setDataMedicao(Timestamp dataMedicao) {
		this.dataMedicao = dataMedicao;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public int getMedidorId() {
		return medidorId;
	}

	public void setMedidorId(int medidorId) {
		this.medidorId = medidorId;
	}

	public int getTimeRotaId() {
		return timeRotaId;
	}

	public void setTimeRotaId(int timeRotaId) {
		this.timeRotaId = timeRotaId;
	}
	
}
