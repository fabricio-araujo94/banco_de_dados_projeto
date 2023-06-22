package br.com.luz.model;

public class TipoPessoa extends GenericModel {
	String descricao;

	public TipoPessoa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public TipoPessoa(Integer id, String descricao) {
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
		return "TipoPessoa [descricao=" + descricao + ", getId()=" + this.getId() + "]";
	}
	
	
}
