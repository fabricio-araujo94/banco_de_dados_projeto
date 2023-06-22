package br.com.luz.servico;

import java.util.Scanner;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.luz.DAO.ContratoDAO;
import br.com.luz.model.Contrato;

public class ServicoContrato extends ContratoDAO {
	private static ContratoDAO contrato = new ContratoDAO();
	private static Scanner scan = new Scanner(System.in);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void consultaContrato() {
		System.out.print("Digite o id do contrato: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(contrato.selectContrato(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirContrato() throws ParseException {
		System.out.print("Descrição: ");
		String descricao = scan.nextLine();
		
		System.out.print("\nData de Início: ");
		String data = scan.next();
		Date dataCon = dateFormat.parse(data);
		Timestamp dataInicio = new Timestamp(dataCon.getTime());
		scan.nextLine();
		
		System.out.print("\nData de criação: ");
		data = scan.next();
		dataCon = dateFormat.parse(data);
		Timestamp dataCriacao = new Timestamp(dataCon.getTime());
		scan.nextLine();
		
		System.out.print("\nMedidor(ID): ");
		int medidor = scan.nextInt();
		scan.nextLine();
		
		System.out.print("\nClasse(ID): ");
		int classe = scan.nextInt();
		scan.nextLine();
		
		System.out.print("\nCliente(ID): ");
		int cliente = scan.nextInt();
		scan.nextLine();
		
		Contrato contratoIn = new Contrato(0, descricao, dataInicio, dataCriacao, medidor, classe, cliente);
		
		try {
			contrato.insertContrato(contratoIn);
		} finally {
			//
		}
	}
	
	public static void alterarContrato() throws SQLException, ParseException {
		System.out.println("Qual o id do contrato: ");
		int id = scan.nextInt();
		
		Contrato contratoId = contrato.selectContrato(id);
		
		System.out.println(contratoId);
		
		System.out.print("Descrição: ");
		contratoId.setDescricao(scan.nextLine());
		
		System.out.print("\nData de Início: ");
		String data = scan.next();
		Date dataCon = dateFormat.parse(data);
		contratoId.setDataInicio(new Timestamp(dataCon.getTime()));
		scan.nextLine();
		
		System.out.print("\nData de criação: ");
		data = scan.next();
		dataCon = dateFormat.parse(data);
		contratoId.setDataCriacao(new Timestamp(dataCon.getTime()));
		scan.nextLine();
		
		System.out.print("\nMedidor(ID): ");
		contratoId.setMedidorId(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nClasse(ID): ");
		contratoId.setClasseId(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nCliente(ID): ");
		contratoId.setClienteId(scan.nextInt());
		scan.nextLine();
		
		try {
			contrato.updateContrato(contratoId);
		} finally {
			//
		}
	}
	
	public static void deletarContrato() throws SQLException {
		System.out.print("Digite o id do contrato: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(contrato.deleteContrato(id));
	}

}