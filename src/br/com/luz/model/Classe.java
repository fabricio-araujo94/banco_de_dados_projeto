package br.com.luz.model;

public class Classe extends GenericModel {
	String descricao;
	int tipoFaseId;
	
	public Classe(Integer id, String descricao, int tipoFaseId) {
		super.setId(id);;
		this.descricao = descricao;
		this.tipoFaseId = tipoFaseId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipoFaseId() {
		return tipoFaseId;
	}

	public void setTipoFaseId(int tipoFaseId) {
		this.tipoFaseId = tipoFaseId;
	}

	@Override
	public String toString() {
		return "Classe [descricao=" + descricao + ", tipoFaseId=" + tipoFaseId + ", getId()=" + this.getId() + "]";
	}


}
