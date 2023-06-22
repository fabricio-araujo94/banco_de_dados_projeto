package br.com.luz.model;

public class Tarifa extends GenericModel {
	String taxa;
	int classeId;
	String lei;
	String dataInicio;
	String dataFim;
	String aliquotaICMS;
	
	public Tarifa(Integer id, String taxa, int classeId, String lei, String dataInicio, String dataFim, String aliquotaICMS) {
		super.setId(id);
		this.taxa = taxa;
		this.classeId = classeId;
		this.lei = lei;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.aliquotaICMS = aliquotaICMS;
	}

	public String getTaxa() {
		return taxa;
	}

	public void setTaxa(String taxa) {
		this.taxa = taxa;
	}

	public int getClasseId() {
		return classeId;
	}

	public void setClasseId(int classeId) {
		this.classeId = classeId;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getAliquotaICMS() {
		return aliquotaICMS;
	}

	public void setAliquotaICMS(String aliquotaICMS) {
		this.aliquotaICMS = aliquotaICMS;
	}

	@Override
	public String toString() {
		return "Tarifa [taxa=" + taxa + ", classeId=" + classeId + ", lei=" + lei + ", dataInicio=" + dataInicio
				+ ", dataFim=" + dataFim + ", aliquotaICMS=" + aliquotaICMS + ", getId()=" + this.getId() + "]";
	}
	
}
