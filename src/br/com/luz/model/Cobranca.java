package br.com.luz.model;

public class Cobranca extends GenericModel {
	String mes_referencia;
	String ano_referencia;
	int tarifa_id;
	int medicao_id;
	
	public Cobranca(Integer id, String mes_referencia, String ano_referencia, int tarifa_id, int medicao_id) {
		super.setId(id);
		this.mes_referencia = mes_referencia;
		this.ano_referencia = ano_referencia;
		this.tarifa_id = tarifa_id;
		this.medicao_id = medicao_id;
	}

	public String getMes_referencia() {
		return mes_referencia;
	}

	public void setMes_referencia(String mes_referencia) {
		this.mes_referencia = mes_referencia;
	}

	public String getAno_referencia() {
		return ano_referencia;
	}

	public void setAno_referencia(String ano_referencia) {
		this.ano_referencia = ano_referencia;
	}

	public int getTarifa_id() {
		return tarifa_id;
	}

	public void setTarifa_id(int tarifa_id) {
		this.tarifa_id = tarifa_id;
	}

	public int getMedicao_id() {
		return medicao_id;
	}

	public void setMedicao_id(int medicao_id) {
		this.medicao_id = medicao_id;
	}
	
}
