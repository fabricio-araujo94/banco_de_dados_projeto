package br.com.luz.servico;

import java.util.Scanner;
import java.sql.SQLException;

import br.com.luz.DAO.MedidorDAO;
import br.com.luz.model.Medidor;

public class ServicoMedidor extends MedidorDAO {
	private static MedidorDAO medidor = new MedidorDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaMedidor() {
		System.out.print("Digite o id do medição: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(medidor.selectMedidor(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirMedidor() {
		System.out.print("\nDescrição: ");
		String descricao = scan.next();
		scan.nextLine();
		
		System.out.print("\nRota(ID): ");
		int rota = scan.nextInt();
		scan.nextLine();
		
		System.out.print("\nPoste(ID): ");
		int poste = scan.nextInt();
		scan.nextLine();
		
		Medidor medidorIn = new Medidor(0, descricao, rota, poste);
		
		try {
			medidor.insertMedidor(medidorIn);
		} finally {
			//
		}
	}
	
	public static void alterarMedidor() throws SQLException {
		System.out.println("Qual o id do medidor: ");
		int id = scan.nextInt();
		
		Medidor medidorId = medidor.selectMedidor(id);
		
		System.out.println(medidorId);
		
		System.out.print("Descrição: ");
		medidorId.setDescricao(scan.next());
		scan.nextLine();
		
		System.out.print("\nRota(ID): ");
		medidorId.setRotaId(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nPoste(ID): ");
		medidorId.setPosteId(scan.nextInt());
		scan.nextLine();
		
		try {
			medidor.updateMedidor(medidorId);
		} finally {
			//
		}
	}
	
	public static void deletarMedidor() throws SQLException {
		System.out.print("Digite o id do medidor: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(medidor.deleteMedidor(id));
	}

}
