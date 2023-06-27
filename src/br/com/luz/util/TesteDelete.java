package br.com.luz.util;

import br.com.luz.DAO.MedidorDAO;
import br.com.luz.model.Medidor;

import java.sql.SQLException;
import java.util.List;

public class TesteDelete {
	public static void main (String[] args) throws SQLException {
		MedidorDAO medidor = new MedidorDAO();
		
		medidor.insertMedidor(new Medidor(1, "abc-3", 1, 1));
		
		imprimirSelectAll();
		
		medidor.deleteMedidor(3);
				
		imprimirSelectAll();
	}
	
	public static void imprimirSelectAll() {
		MedidorDAO medidor = new MedidorDAO();
		
		List<Medidor> medidores = null;
		
		medidores = medidor.selectAllMedidor();
		
		for (int i = 0; i < medidores.size(); i++) {
			System.out.println(medidores.get(i));
		}
		
		System.out.println();
	}
	
}
