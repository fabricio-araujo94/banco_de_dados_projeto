package br.com.luz.model;

public class Rota extends GenericModel {
	String descricao;

	public Rota(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public Rota(Integer id, String descricao) {
		super.setId(id);;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
