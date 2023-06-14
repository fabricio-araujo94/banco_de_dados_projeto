package br.com.luz.model;

import java.util.Calendar;

public class Medicao extends GenericModel {
	String mes;
	String ano;
	Calendar data_medicao;
	String consumo;
	Medidor medidor;
	Time_rota time_rota;
	
	public Medicao(Integer id, String mes, String ano, Calendar data_medicao, String consumo, Medidor medidor,
			Time_rota time_rota) {
		super.setId(id);;
		this.mes = mes;
		this.ano = ano;
		this.data_medicao = data_medicao;
		this.consumo = consumo;
		this.medidor = medidor;
		this.time_rota = time_rota;
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

	public Calendar getData_medicao() {
		return data_medicao;
	}

	public void setData_medicao(Calendar data_medicao) {
		this.data_medicao = data_medicao;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public Medidor getMedidor() {
		return medidor;
	}

	public void setMedidor(Medidor medidor) {
		this.medidor = medidor;
	}

	public Time_rota getTime_rota() {
		return time_rota;
	}

	public void setTime_rota(Time_rota time_rota) {
		this.time_rota = time_rota;
	}
	
	
	
}
