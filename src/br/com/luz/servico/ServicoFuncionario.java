package br.com.luz.servico;

import java.util.Scanner;
import java.sql.SQLException;

import br.com.luz.DAO.FuncionarioDAO;
import br.com.luz.model.Funcionario;

public class ServicoFuncionario extends FuncionarioDAO {
	private static FuncionarioDAO funcionario = new FuncionarioDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaFuncionario() {
		System.out.print("Digite o id do funcionario: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(funcionario.selectFuncionario(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirFuncionario() {
		System.out.print("Código Funcional: ");
		String codigo = scan.next();
		scan.nextLine();
		
		System.out.print("\nPessoa(ID): ");
		int pessoa = scan.nextInt();
		scan.nextLine();
		
		Funcionario funcionarioIn = new Funcionario(0, codigo, pessoa);
		
		try {
			funcionario.insertFuncionario(funcionarioIn);
		} finally {
			//
		}
	}
	
	public static void alterarFuncionario() throws SQLException {
		System.out.println("Qual o id do funcionario: ");
		int id = scan.nextInt();
		
		Funcionario funcionarioId = funcionario.selectFuncionario(id);
		
		System.out.println(funcionarioId);
		
		System.out.print("Código Funcional: ");
		funcionarioId.setCodigoFuncional(scan.next());			
		
		System.out.print("\nPessoa(ID): ");
		funcionarioId.setPessoaId(scan.nextInt());
		scan.nextLine();
		
		try {
			funcionario.updateFuncionario(funcionarioId);
		} finally {
			//
		}
	}
	
	public static void deletarFuncionario() throws SQLException {
		System.out.print("Digite o id do funcionario: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(funcionario.deleteFuncionario(id));
	}

}