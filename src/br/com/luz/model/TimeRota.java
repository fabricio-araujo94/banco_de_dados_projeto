package br.com.luz.model;

public class TimeRota extends GenericModel {
	int funcionarioId;
	int tarefaRotaId;
	
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
	
	
	
}
