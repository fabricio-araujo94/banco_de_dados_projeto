package br.com.luz.model;

public class Tipo_fase extends GenericModel {
	private String descricao;

    public Tipo_fase(String descricao) {
        this.descricao = descricao;
    }

    public Tipo_fase(Integer id, String descricao) {
        this.descricao = descricao;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tipo Fase {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + descricao + "\'" +
                '}';
    }
}
