package br.com.luz.model;

public class Classe extends GenericModel {
	String descricao;
	int tipo_fase_id;
	
	public Classe(Integer id, String descricao, int tipo_fase_id) {
		super.setId(id);;
		this.descricao = descricao;
		this.tipo_fase_id = tipo_fase_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo_fase() {
		return tipo_fase_id;
	}

	public void setTipo_fase(int tipo_fase_id) {
		this.tipo_fase_id = tipo_fase_id;
	}
}
