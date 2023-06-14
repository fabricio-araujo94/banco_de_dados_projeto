package br.com.luz.model;

public class Pessoa extends GenericModel {
	String nome;
	String cpf;
	String cnpj;
	Tipo_pessoa tipo_pessoa;
	
	public Pessoa(Integer id, String nome, String cpf, String cnpj, Tipo_pessoa tipo_pessoa) {
		super.setId(id);;
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.tipo_pessoa = tipo_pessoa;
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

	public Tipo_pessoa getTipo_pessoa() {
		return tipo_pessoa;
	}

	public void setTipo_pessoa_id(Tipo_pessoa tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}
	
	
}
