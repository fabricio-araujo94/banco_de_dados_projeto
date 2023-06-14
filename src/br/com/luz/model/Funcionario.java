package br.com.luz.model;

public class Funcionario extends GenericModel {
	String codigo_funcional;
	Pessoa pessoa;
	
	public Funcionario(Integer id, String codigo_funcional, Pessoa pessoa) {
		super.setId(id);;
		this.codigo_funcional = codigo_funcional;
		this.pessoa = pessoa;
	}

	public String getCodigo_funcional() {
		return codigo_funcional;
	}

	public void setCodigo_funcional(String codigo_funcional) {
		this.codigo_funcional = codigo_funcional;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
