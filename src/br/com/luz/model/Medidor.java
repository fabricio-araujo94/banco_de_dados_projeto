package br.com.luz.model;

public class Medidor extends GenericModel {
	String descricao;
	int rota_id;
	int poste_id;
	
	public Medidor(Integer id, String descricao, int rota_id, int poste_id) {
		super.setId(id);;
		this.descricao = descricao;
		this.rota_id = rota_id;
		this.poste_id = poste_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getRota_id() {
		return rota_id;
	}

	public void setRota_id(int rota_id) {
		this.rota_id = rota_id;
	}

	public int getPoste_id() {
		return poste_id;
	}

	public void setPoste_id(int poste_id) {
		this.poste_id = poste_id;
	}
	
	
	
	
}
