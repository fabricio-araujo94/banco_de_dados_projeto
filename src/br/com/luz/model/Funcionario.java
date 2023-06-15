package br.com.luz.model;

public class Funcionario extends GenericModel {
	String codigo_funcional;
	int pessoa_id;
	
	public Funcionario(Integer id, String codigo_funcional, int pessoa_id) {
		super.setId(id);;
		this.codigo_funcional = codigo_funcional;
		this.pessoa_id = pessoa_id;
	}

	public String getCodigo_funcional() {
		return codigo_funcional;
	}

	public void setCodigo_funcional(String codigo_funcional) {
		this.codigo_funcional = codigo_funcional;
	}

	public int getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	
	
}
