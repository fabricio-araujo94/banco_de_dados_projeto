package br.com.luz.util;

import java.sql.SQLException;

import br.com.luz.DAO.RotaDAO;
import br.com.luz.model.Rota;

public class TesteUpdate {
	public static void main (String[] args) throws SQLException {
		RotaDAO rota = new RotaDAO();
		
		Rota rota1 = rota.selectRota(1);
		
		System.out.println(rota1);
		
		rota1.setDescricao("Update teste");
		rota.updateRota(rota1);
		
		rota1 = rota.selectRota(1);
		
		System.out.println(rota1);
		
		rota1.setDescricao("Rota Litoral");
		rota.updateRota(rota1);
		
	}
}
