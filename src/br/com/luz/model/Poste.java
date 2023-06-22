package br.com.luz.model;

public class Poste extends GenericModel {
	String latitude;
	String longitude;
	String codigo;
	String observacao;
	
	public Poste(Integer id, String latitude, String longitude, String codigo, String observacao) {
		super.setId(id);;
		this.latitude = latitude;
		this.longitude = longitude;
		this.codigo = codigo;
		this.observacao = observacao;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Poste [latitude=" + latitude + ", longitude=" + longitude + ", codigo=" + codigo + ", observacao="
				+ observacao + ", getId()=" + this.getId() + "]";
	}
	
	
}
