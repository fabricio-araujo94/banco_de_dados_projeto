package br.com.luz.servico;

import java.util.Scanner;
import java.sql.SQLException;

import br.com.luz.DAO.RotaDAO;
import br.com.luz.model.Rota;

public class ServicoRota extends RotaDAO {
	private static RotaDAO rota = new RotaDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaRota() {
		System.out.print("Digite o id da rota: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(rota.selectRota(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirRota() {
		System.out.print("Descrição: ");
		String descricao = scan.nextLine();
		
		Rota rotaIn = new Rota(0, descricao);
		
		try {
			rota.insertRota(rotaIn);
		} finally {
			//
		}
	}
	
	public static void alterarRota() throws SQLException {
		System.out.println("Qual o id da rota: ");
		int id = scan.nextInt();
		
		Rota rotaId = rota.selectRota(id);
		
		System.out.println(rotaId);
		
		System.out.print("Descrição: ");
		rotaId.setDescricao(scan.nextLine());			
		
		try {
			rota.updateRota(rotaId);
		} finally {
			//
		}
	}
	
	public static void deletarRota() throws SQLException {
		System.out.print("Digite o id do rota: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(rota.deleteRota(id));
	}

}