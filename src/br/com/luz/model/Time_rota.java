package br.com.luz.model;

public class Time_rota extends GenericModel {
	int funcionario_id;
	int tarefa_rota_id;
	
	public Time_rota(Integer id, int funcionario_id, int tarefa_rota_id) {
		super.setId(id);
		this.funcionario_id = funcionario_id;
		this.tarefa_rota_id = tarefa_rota_id;
	}

	public int getFuncionario_id() {
		return funcionario_id;
	}

	public void setFuncionario_id(int funcionario_id) {
		this.funcionario_id = funcionario_id;
	}

	public int getTarefa_rota_id() {
		return tarefa_rota_id;
	}

	public void setTarefa_rota_id(int tarefa_rota_id) {
		this.tarefa_rota_id = tarefa_rota_id;
	}
	
	
	
}
