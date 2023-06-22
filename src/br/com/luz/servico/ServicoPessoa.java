package br.com.luz.servico;

import br.com.luz.DAO.PessoaDAO;
import br.com.luz.model.Pessoa;

import java.sql.SQLException;
import java.util.Scanner;

public class ServicoPessoa extends PessoaDAO {
	private static PessoaDAO pessoa = new PessoaDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaPessoa() throws Exception {
		System.out.print("Digite o id da pessoa: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(pessoa.selectPessoa(id));
	}
	
	public static void inserirPessoa() throws Exception {
		System.out.print("Nome: ");
		String nome = scan.next();
		scan.nextLine();
		
		System.out.print("\nCpf: ");
		String cpf = scan.next();
		scan.nextLine();
		
		System.out.print("\nCnpj: ");
		String codigo = scan.next();
		scan.nextLine();
		
		System.out.print("\nTipo Pessoa(ID): ");
		int tipoPessoaId = scan.nextInt();
		
		Pessoa pessoaIn = new Pessoa(0, nome, cpf, codigo, tipoPessoaId);
		
		try {
			pessoa.insertPessoa(pessoaIn);
		} finally {
			System.out.println("POSTE ADICIONADO COM SUCESSO");
		}
	}
	
	public static void alterarPessoa() throws SQLException, Exception {
		System.out.println("Qual o id do pessoa: ");
		int id = scan.nextInt();
		
		Pessoa pessoaId = pessoa.selectPessoa(id);
		
		System.out.println(pessoaId);
		
		System.out.print("Nome: ");
		pessoaId.setNome(scan.next());
		scan.nextLine();
		
		System.out.print("\nCpf: ");
		pessoaId.setCpf(scan.next());
		scan.nextLine();
		
		System.out.print("\nCnpj: ");
		pessoaId.setCnpj(scan.next());
		scan.nextLine();
		
		System.out.print("\nTipo Pessoa(ID): ");
		pessoaId.setTipoPessoaId(scan.nextInt());
		
		try {
			pessoa.updatePessoa(pessoaId);
		} finally {
			//
		}
	}
	
	public static void deletarPessoa() throws SQLException {
		System.out.print("Digite o id do pessoa: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(pessoa.deletePessoa(id));
	}
}
