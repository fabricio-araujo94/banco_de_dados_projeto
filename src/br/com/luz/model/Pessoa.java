package br.com.luz.model;

public class Pessoa extends GenericModel {
	String nome;
	String cpf;
	String cnpj;
	int tipo_pessoa_id;
	
	public Pessoa(Integer id, String nome, String cpf, String cnpj, int tipo_pessoa_id) {
		super.setId(id);;
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.tipo_pessoa_id = tipo_pessoa_id;
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

	public int getTipo_pessoa_id() {
		return tipo_pessoa_id;
	}

	public void setTipo_pessoa_id(int tipo_pessoa_id) {
		this.tipo_pessoa_id = tipo_pessoa_id;
	}
	
	
}
