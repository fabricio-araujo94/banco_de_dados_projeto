package br.com.luz.model;

public class Funcionario extends GenericModel {
	String codigoFuncional;
	int pessoaId;
	
	public Funcionario(Integer id, String codigoFuncional, int pessoaId) {
		super.setId(id);;
		this.codigoFuncional = codigoFuncional;
		this.pessoaId = pessoaId;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public int getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(int pessoaId) {
		this.pessoaId = pessoaId;
	}

	@Override
	public String toString() {
		return "Funcionario [codigoFuncional=" + codigoFuncional + ", pessoaId=" + pessoaId + ", getId()=" + this.getId()
				+ "]";
	}
	
}
