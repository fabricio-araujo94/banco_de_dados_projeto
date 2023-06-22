package br.com.luz.servico;

import br.com.luz.DAO.PosteDAO;
import br.com.luz.model.Poste;

import java.sql.SQLException;
import java.util.Scanner;

public class ServicoPoste extends PosteDAO {
	private static PosteDAO poste = new PosteDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaPoste() {
		System.out.print("Digite o id do poste: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(poste.selectPoste(id));
	}
	
	public static void inserirPoste() {
		System.out.print("Latitude: ");
		String latitude = scan.next();
		scan.nextLine();
		
		System.out.print("\nLongitude: ");
		String longitude = scan.next();
		scan.nextLine();
		
		System.out.print("\nCódigo: ");
		String codigo = scan.next();
		scan.nextLine();
		
		System.out.print("\nObservação: ");
		String observacao = scan.nextLine();
		
		Poste posteIn = new Poste(0, latitude, longitude, codigo, observacao);
		
		try {
			poste.insertPoste(posteIn);
		} finally {
			System.out.println("POSTE ADICIONADO COM SUCESSO");
		}
	}
	
	public static void alterarPoste() throws SQLException {
		System.out.println("Qual o id do poste: ");
		int id = scan.nextInt();
		
		Poste posteId = poste.selectPoste(id);
		
		System.out.println(posteId);
		
		System.out.print("Latitude: ");
		posteId.setLatitude(scan.next());
		scan.nextLine();
		
		System.out.print("\nLongitude: ");
		posteId.setLongitude(scan.next());
		scan.nextLine();
		
		System.out.print("\nCódigo: ");
		posteId.setCodigo(scan.next());
		scan.nextLine();
		
		System.out.print("\nObservação: ");
		posteId.setObservacao(scan.nextLine());
		
		try {
			poste.updatePoste(posteId);
		} finally {
			//
		}
	}
	
	public static void deletarPoste() throws SQLException {
		System.out.print("Digite o id do poste: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(poste.deletePoste(id));
	}
}
