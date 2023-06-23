package br.com.luz.model;

import br.com.luz.DAO.PessoaDAO;

public class Cliente extends GenericModel {
	String numDocumento;
	String numCliente;
	int pessoaId;
	
	PessoaDAO pessoa = new PessoaDAO();
	
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

	@Override
	public String toString() {
		return "Cliente [numDocumento=" + numDocumento + ", numCliente=" + numCliente + ", pessoaId=" + pessoa.selectPessoa(pessoaId)
				+ ", getId()=" + this.getId() + "]";
	}
	
	
}
