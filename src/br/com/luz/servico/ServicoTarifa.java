package br.com.luz.servico;

import java.util.Scanner;
import java.sql.SQLException;

import br.com.luz.DAO.TarifaDAO;
import br.com.luz.model.Tarifa;

public class ServicoTarifa extends TarifaDAO {
	private static TarifaDAO tarifa = new TarifaDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaTarifa() {
		System.out.print("Digite o id da tarifa: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(tarifa.selectTarifa(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirTarifa() {
		System.out.print("Taxa: ");
		String taxa = scan.next();
		scan.nextLine();
		
		System.out.print("\nData de Início: ");
		int classe = scan.nextInt();
		
		System.out.print("\nLei: ");
		String lei = scan.next();
		scan.nextLine();
		
		System.out.print("\nData de Início: ");
		String dataInicio = scan.next();
		scan.nextLine();
		
		System.out.print("\nData de Fim: ");
		String dataFim = scan.next();
		scan.nextLine();
		
		System.out.print("\nAliquota ICMS: ");
		String aliquota_ICMS = scan.next();
		scan.nextLine();
		
		Tarifa tarifaIn = new Tarifa(0, taxa, classe, lei, dataInicio, dataFim, aliquota_ICMS);
		
		try {
			tarifa.insertTarifa(tarifaIn);
		} finally {
			//
		}
	}
	
	public static void alterarTarifa() throws SQLException {
		System.out.println("Qual o id do tarifa: ");
		int id = scan.nextInt();
		
		Tarifa tarifaId = tarifa.selectTarifa(id);
		
		System.out.println(tarifaId);
		
		System.out.print("Taxa: ");
		tarifaId.setTaxa(scan.next());
		scan.nextLine();
				
		System.out.print("\nClasse: ");
		tarifaId.setClasseId(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nData de Início: ");
		tarifaId.setDataInicio(scan.next());
		scan.nextLine();
		
		System.out.print("\nData de Fim: ");
		tarifaId.setDataFim(scan.next());
		scan.nextLine();
		
		System.out.print("\nAliquota ICMS: ");
		tarifaId.setAliquotaICMS(scan.next());
		scan.nextLine();
		
		try {
			tarifa.updateTarifa(tarifaId);
		} finally {
			//
		}
	}
	
	public static void deletarTarifa() throws SQLException {
		System.out.print("Digite o id do tarifa: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(tarifa.deleteTarifa(id));
	}

}