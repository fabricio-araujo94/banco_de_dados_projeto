package br.com.luz.model;

public class Time_rota extends GenericModel {
	Funcionario funcionario;
	Tarefa_rota tarefa_rota;
	
	public Time_rota(Integer id, Funcionario funcionario, Tarefa_rota tarefa_rota) {
		super.setId(id);;
		this.funcionario = funcionario;
		this.tarefa_rota = tarefa_rota;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Tarefa_rota getTarefa_rota() {
		return tarefa_rota;
	}

	public void setTarefa_rota(Tarefa_rota tarefa_rota) {
		this.tarefa_rota = tarefa_rota;
	}
	
	
	
}
