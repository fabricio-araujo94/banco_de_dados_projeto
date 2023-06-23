package br.com.luz.model;

import br.com.luz.DAO.FuncionarioDAO;
import br.com.luz.DAO.TarefaRotaDAO;

public class TimeRota extends GenericModel {
	int funcionarioId;
	int tarefaRotaId;
	
	FuncionarioDAO funcionario = new FuncionarioDAO();
	TarefaRotaDAO tarefaRota = new TarefaRotaDAO();
	
	public TimeRota(Integer id, int funcionarioId, int tarefaRotaId) {
		super.setId(id);
		this.funcionarioId = funcionarioId;
		this.tarefaRotaId = tarefaRotaId;
	}

	public int getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(int funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	public int getTarefaRotaId() {
		return tarefaRotaId;
	}

	public void setTarefaRotaId(int tarefaRotaId) {
		this.tarefaRotaId = tarefaRotaId;
	}

	@Override
	public String toString() {
		return "TimeRota [funcionario=" + funcionario.selectFuncionario(funcionarioId) + ", tarefaRota=" + tarefaRota.selectTarefaRota(tarefaRotaId) + ", getId()=" + this.getId()
				+ "]";
	}
		
}
