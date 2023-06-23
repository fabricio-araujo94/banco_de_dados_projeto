package br.com.luz.model;

import br.com.luz.DAO.TarifaDAO;
import br.com.luz.DAO.MedicaoDAO;

public class Cobranca extends GenericModel {
	String mesReferencia;
	String anoReferencia;
	int tarifaId;
	int medicaoId;
	
	TarifaDAO tarifa = new TarifaDAO();
	MedicaoDAO medicao = new MedicaoDAO();
	
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

	@Override
	public String toString() {
		return "Cobranca [mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia + ", tarifaId="
				+ tarifa.selectTarifa(tarifaId) + ", medicaoId=" + medicao.selectMedicao(medicaoId) + ", getId()=" + this.getId() + "]";
	}

	
}
