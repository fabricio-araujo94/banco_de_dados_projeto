package br.com.luz.model;

import java.util.Calendar;

public class Contrato extends GenericModel {
	String descricao;
	Calendar data_inicio;
	Calendar data_criacao;
	Medidor medidor;
	Classe classe;
	Cliente cliente;
	
	public Contrato(Integer id, String descricao, Calendar data_inicio, Calendar data_criacao, Medidor medidor, Classe classe,
			Cliente cliente) {
		super.setId(id);;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_criacao = data_criacao;
		this.medidor = medidor;
		this.classe = classe;
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Calendar data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Calendar getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Calendar data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Medidor getMedidor() {
		return medidor;
	}

	public void setMedidor(Medidor medidor) {
		this.medidor = medidor;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
