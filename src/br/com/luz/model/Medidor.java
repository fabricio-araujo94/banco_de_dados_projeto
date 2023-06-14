package br.com.luz.model;

public class Medidor extends GenericModel {
	String descricao;
	Rota rota;
	Poste poste;
	
	public Medidor(Integer id, String descricao, Rota rota, Poste poste) {
		super.setId(id);;
		this.descricao = descricao;
		this.rota = rota;
		this.poste = poste;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	
	
	
	
}
