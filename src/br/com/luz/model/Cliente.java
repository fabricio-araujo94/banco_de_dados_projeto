package br.com.luz.model;

public class Cliente extends GenericModel {
	String num_documento;
	String num_cliente;
	int pessoa_id;
	
	public Cliente(Integer id, String num_documento, String num_cliente, int pessoa_id) {
		super.setId(id);;
		this.num_documento = num_documento;
		this.num_cliente = num_cliente;
		this.pessoa_id = pessoa_id;
	}

	public String getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}

	public String getNum_cliente() {
		return num_cliente;
	}

	public void setNum_cliente(String num_cliente) {
		this.num_cliente = num_cliente;
	}

	public int getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	
	
}
