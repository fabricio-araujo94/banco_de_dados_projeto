package br.com.luz.model;

import java.sql.Timestamp;

public class Medicao extends GenericModel {
	String mes;
	String ano;
	Timestamp data_medicao;
	String consumo;
	int medidor_id;
	int time_rota_id;
	
	public Medicao(Integer id, String mes, String ano, Timestamp data_medicao, String consumo, int medidor_id, 
			int time_rota_id) {
		super.setId(id);;
		this.mes = mes;
		this.ano = ano;
		this.data_medicao = data_medicao;
		this.consumo = consumo;
		this.medidor_id = medidor_id;
		this.time_rota_id = time_rota_id;
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

	public Timestamp getData_medicao() {
		return data_medicao;
	}

	public void setData_medicao(Timestamp data_medicao) {
		this.data_medicao = data_medicao;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public int getMedidor_id() {
		return medidor_id;
	}

	public void setMedidor_id(int medidor_id) {
		this.medidor_id = medidor_id;
	}

	public int getTime_rota_id() {
		return time_rota_id;
	}

	public void setTime_rota_id(int time_rota_id) {
		this.time_rota_id = time_rota_id;
	}
	
	
	
}
