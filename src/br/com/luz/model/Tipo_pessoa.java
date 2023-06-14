package br.com.luz.model;

public class Tipo_pessoa extends GenericModel {
	String descricao;

	public Tipo_pessoa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public Tipo_pessoa(Integer id, String descricao) {
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
