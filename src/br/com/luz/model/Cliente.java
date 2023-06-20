package br.com.luz.model;

public class Cliente extends GenericModel {
	String numDocumento;
	String numCliente;
	int pessoaId;
	
	public Cliente(Integer id, String numDocumento, String numCliente, int pessoaId) {
		super.setId(id);
		this.numDocumento = numDocumento;
		this.numCliente = numCliente;
		this.pessoaId = pessoaId;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	public int getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(int pessoaId) {
		this.pessoaId = pessoaId;
	}
	
	
}
