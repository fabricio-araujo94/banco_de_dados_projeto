package br.com.luz.model;

public class Rota extends GenericModel {
	String descricao;
	
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

	@Override
	public String toString() {
		return "Rota [descricao=" + descricao + ", getId()=" + this.getId() + "]";
	}
	
}
