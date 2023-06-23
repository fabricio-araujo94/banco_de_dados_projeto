package br.com.luz.model;

import br.com.luz.DAO.RotaDAO;
import br.com.luz.DAO.PosteDAO;

public class Medidor extends GenericModel {
	String descricao;
	int rotaId;
	int posteId;
	
	RotaDAO rota = new RotaDAO();
	PosteDAO poste = new PosteDAO();
	
	public Medidor(Integer id, String descricao, int rotaId, int posteId) {
		super.setId(id);
		this.descricao = descricao;
		this.rotaId = rotaId;
		this.posteId = posteId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getRotaId() {
		return rotaId;
	}

	public void setRotaId(int rotaId) {
		this.rotaId = rotaId;
	}

	public int getPosteId() {
		return posteId;
	}

	public void setPosteId(int posteId) {
		this.posteId = posteId;
	}

	@Override
	public String toString() {
		return "Medidor [descricao=" + descricao + ", rota=" + rota.selectRota(rotaId) + ", poste=" + poste.selectPoste(posteId) + ", getId()="
				+ this.getId() + "]";
	}
	
}
