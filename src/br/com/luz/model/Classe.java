package br.com.luz.model;

public class Classe extends GenericModel {
	String descricao;
	Tipo_fase tipo_fase;
	
	public Classe(String descricao, Tipo_fase tipo_fase) {
		super();
		this.descricao = descricao;
		this.tipo_fase = tipo_fase;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo_fase getTipo_fase() {
		return tipo_fase;
	}

	public void setTipo_fase(Tipo_fase tipo_fase) {
		this.tipo_fase = tipo_fase;
	}
	
	
}
