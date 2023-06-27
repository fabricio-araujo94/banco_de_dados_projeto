package br.com.luz.util;

import br.com.luz.DAO.ContratoDAO;
import br.com.luz.DAO.MedicaoDAO;
import br.com.luz.model.Medicao;

import java.util.List;

public class TesteSelect {
	public static void main(String[] args) {
		ContratoDAO contrato = new ContratoDAO();
		MedicaoDAO medicao = new MedicaoDAO();
		
		System.out.println(contrato.selectContrato(1));
		System.out.println(contrato.selectContrato(2));
		
		List<Medicao> medicoes = null;
		
		medicoes = medicao.selectAllMedicao();
		
		for (int i = 0; i < medicoes.size(); i++) {
			System.out.println(medicoes.get(i));
		}
	}
}
