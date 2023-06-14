package br.com.luz.model;

public class Tarifa extends GenericModel {
	String taxa;
	Classe classe;
	String lei;
	String data_inicio;
	String data_fim;
	String aliquota_ICMS;
	
	public Tarifa(Integer id, String taxa, Classe classe, String lei, String data_inicio, String data_fim, String aliquota_ICMS) {
		super.setId(id);;
		this.taxa = taxa;
		this.classe = classe;
		this.lei = lei;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.aliquota_ICMS = aliquota_ICMS;
	}

	public String getTaxa() {
		return taxa;
	}

	public void setTaxa(String taxa) {
		this.taxa = taxa;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}

	public String getAliquota_ICMS() {
		return aliquota_ICMS;
	}

	public void setAliquota_ICMS(String aliquota_ICMS) {
		this.aliquota_ICMS = aliquota_ICMS;
	}
	
	
	
	
}
