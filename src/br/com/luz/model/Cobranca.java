package br.com.luz.model;

public class Cobranca extends GenericModel {
	String mesReferencia;
	String anoReferencia;
	int tarifaId;
	int medicaoId;
	
	public Cobranca(Integer id, String mesReferencia, String anoReferencia, int tarifaId, int medicaoId) {
		super.setId(id);
		this.mesReferencia = mesReferencia;
		this.anoReferencia = anoReferencia;
		this.tarifaId = tarifaId;
		this.medicaoId = medicaoId;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public String getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(String anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	public int getTarifaId() {
		return tarifaId;
	}

	public void setTarifaId(int tarifaId) {
		this.tarifaId = tarifaId;
	}

	public int getMedicaoId() {
		return medicaoId;
	}

	public void setMedicaoId(int medicaoId) {
		this.medicaoId = medicaoId;
	}

	
}
