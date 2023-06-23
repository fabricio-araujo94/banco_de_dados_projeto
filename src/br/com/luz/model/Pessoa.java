package br.com.luz.model;

import br.com.luz.DAO.TipoPessoaDAO;

public class Pessoa extends GenericModel {
	String nome;
	String cpf;
	String cnpj;
	int tipoPessoaId;
	
	TipoPessoaDAO tipoPessoa = new TipoPessoaDAO();
	
	public Pessoa(Integer id, String nome, String cpf, String cnpj, int tipoPessoaId) {
		if (tipoPessoaId == 1 && cpf != null && !(cpf.isEmpty())) { 
			super.setId(id);;
			this.nome = nome;
			this.cpf = cpf;
			this.cnpj = null;
			this.tipoPessoaId = tipoPessoaId;
		} else if (tipoPessoaId == 2 && cnpj != null && !(cnpj.isEmpty())){
			super.setId(id);;
			this.nome = nome;
			this.cpf = null;
			this.cnpj = cnpj;
			this.tipoPessoaId = tipoPessoaId;
		} else {
			//
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getTipoPessoaId() {
		return tipoPessoaId;
	}

	public void setTipoPessoaId(int tipoPessoaId) {
		this.tipoPessoaId = tipoPessoaId;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", cnpj=" + cnpj + ", tipoPessoa=" + tipoPessoa.selectTipo_pessoa(tipoPessoaId)
				+ ", getId()=" + this.getId() + "]";
	}
}
