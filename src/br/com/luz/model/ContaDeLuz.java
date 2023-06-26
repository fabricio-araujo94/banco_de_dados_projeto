package br.com.luz.model;

import java.sql.Timestamp;

public class ContaDeLuz {
	private String rota;
	private String medidor;
	private String poste;
	private String nome;
	private String cpf;
	private String cnpj;
	private String classe;
	private String tipoFase;
	private Timestamp dataMedição;
	private String Consumo;
	private String taxa;
	private String lei;
	private String aliquota_ICMS;
	private String valor;
	
	public ContaDeLuz(String rota, String medidor, String poste, String nome, String cpf, String cnpj, String classe,
			String tipoFase, Timestamp dataMedição, String consumo, String taxa, String lei, String aliquota_ICMS,
			String valor) {
		super();
		this.rota = rota;
		this.medidor = medidor;
		this.poste = poste;
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.classe = classe;
		this.tipoFase = tipoFase;
		this.dataMedição = dataMedição;
		Consumo = consumo;
		this.taxa = taxa;
		this.lei = lei;
		this.aliquota_ICMS = aliquota_ICMS;
		this.valor = valor;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}

	public String getMedidor() {
		return medidor;
	}

	public void setMedidor(String medidor) {
		this.medidor = medidor;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getTipoFase() {
		return tipoFase;
	}

	public void setTipoFase(String tipoFase) {
		this.tipoFase = tipoFase;
	}

	public Timestamp getDataMedição() {
		return dataMedição;
	}

	public void setDataMedição(Timestamp dataMedição) {
		this.dataMedição = dataMedição;
	}

	public String getConsumo() {
		return Consumo;
	}

	public void setConsumo(String consumo) {
		Consumo = consumo;
	}

	public String getTaxa() {
		return taxa;
	}

	public void setTaxa(String taxa) {
		this.taxa = taxa;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getAliquota_ICMS() {
		return aliquota_ICMS;
	}

	public void setAliquota_ICMS(String aliquota_ICMS) {
		this.aliquota_ICMS = aliquota_ICMS;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Conta De Luz [rota=" + rota + ", medidor=" + medidor + ", poste=" + poste + ", nome=" + nome + ", cpf="
				+ cpf + ", cnpj=" + cnpj + ", classe=" + classe + ", tipoFase=" + tipoFase + ", dataMedição="
				+ dataMedição + ", Consumo=" + Consumo + ", taxa=" + taxa + ", lei=" + lei + ", aliquota_ICMS="
				+ aliquota_ICMS + ", valor=" + valor + "]";
	}

	
}
