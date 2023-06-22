package br.com.luz.servico;

import java.util.Scanner;
import java.sql.SQLException;

import br.com.luz.DAO.CobrancaDAO;
import br.com.luz.model.Cobranca;

public class ServicoCobranca extends CobrancaDAO {
	private static CobrancaDAO cobranca = new CobrancaDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaCobranca() {
		System.out.print("Digite o id da cobranca: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(cobranca.selectCobranca(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirCobranca() {
		System.out.print("Mês referência: ");
		String mesReferencia = scan.next();
		scan.nextLine();
		
		System.out.print("\nAno referência: ");
		String anoReferencia = scan.next();
		scan.nextLine();
		
		System.out.print("\nTarifa(ID): ");
		int tarifa = scan.nextInt();
		scan.nextLine();
		
		System.out.print("\nMedição(ID): ");
		int medicao = scan.nextInt();
		scan.nextLine();
		
		Cobranca cobrancaIn = new Cobranca(0, mesReferencia, anoReferencia, tarifa, medicao);
		
		try {
			cobranca.insertCobranca(cobrancaIn);
		} finally {
			//
		}
	}
	
	public static void alterarCobranca() throws SQLException {
		System.out.println("Qual o id do cobranca: ");
		int id = scan.nextInt();
		
		Cobranca cobrancaId = cobranca.selectCobranca(id);
		
		System.out.println(cobrancaId);
		
		System.out.print("Mês referência: ");
		cobrancaId.setMesReferencia(scan.next());
		scan.nextLine();
		
		System.out.print("\nAno referência: ");
		cobrancaId.setAnoReferencia(scan.next());
		scan.nextLine();
		
		System.out.print("\nTarifa(ID): ");
		cobrancaId.setTarifaId(scan.nextInt());
		scan.nextLine();

		System.out.print("\nMedição(ID): ");
		cobrancaId.setMedicaoId(scan.nextInt());
		scan.nextLine();
		
		try {
			cobranca.updateCobranca(cobrancaId);
		} finally {
			System.out.println("POSTE ATUALIZADO COM SUCESSO");
		}
	}
	
	public static void deletarCobranca() throws SQLException {
		System.out.print("Digite o id do cobranca: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(cobranca.deleteCobranca(id));
	}

}