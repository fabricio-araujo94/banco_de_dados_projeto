package br.com.luz.model;

public class Cobranca extends GenericModel {
	String mes_referencia;
	String ano_referencia;
	Tarifa tarifa;
	Medicao medicao;
	
	public Cobranca(Integer id, String mes_referencia, String ano_referencia, Tarifa tarifa, Medicao medicao) {
		super.setId(id);;
		this.mes_referencia = mes_referencia;
		this.ano_referencia = ano_referencia;
		this.tarifa = tarifa;
		this.medicao = medicao;
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

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public Medicao getMedicao() {
		return medicao;
	}

	public void setMedicao(Medicao medicao) {
		this.medicao = medicao;
	}
	
}
