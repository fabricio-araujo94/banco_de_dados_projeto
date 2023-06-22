package br.com.luz.servico;

import java.util.Scanner;
import java.sql.SQLException;

import br.com.luz.DAO.ClienteDAO;
import br.com.luz.model.Cliente;

public class ServicoCliente extends ClienteDAO {
	private static ClienteDAO cliente = new ClienteDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaCliente() {
		System.out.print("Digite o id do cliente: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(cliente.selectCliente(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirCliente() {
		System.out.print("Número do cliente: ");
		String numCliente = scan.next();
		scan.nextLine();
		
		System.out.print("\nNúmero do documento: ");
		String numDocumento = scan.next();
		scan.nextLine();
		
		System.out.print("\nTipo de pessoa(ID): ");
		int tipoPessoaId = scan.nextInt();
		scan.nextLine();
		
		Cliente clienteIn = new Cliente(0, numCliente, numDocumento, tipoPessoaId);
		
		try {
			cliente.insertCliente(clienteIn);
		} finally {
			//
		}
	}
	
	public static void alterarCliente() throws SQLException {
		System.out.println("Qual o id do cliente: ");
		int id = scan.nextInt();
		
		Cliente clienteId = cliente.selectCliente(id);
		
		System.out.println(clienteId);
		
		System.out.print("Número do Documento: ");
		clienteId.setNumDocumento(scan.next());
		scan.nextLine();
		
		System.out.print("\nNúmero do Cliente: ");
		clienteId.setNumCliente(scan.next());
		scan.nextLine();
		
		System.out.print("\nTipo de Pessoa(ID): ");
		clienteId.setPessoaId(scan.nextInt());
		scan.nextLine();
		
		try {
			cliente.updateCliente(clienteId);
		} finally {
			//
		}
	}
	
	public static void deletarCliente() throws SQLException {
		System.out.print("Digite o id do cliente: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(cliente.deleteCliente(id));
	}

}
