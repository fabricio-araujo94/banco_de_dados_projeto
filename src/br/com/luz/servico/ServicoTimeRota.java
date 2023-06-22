package br.com.luz.servico;

import java.util.Scanner;
import java.util.Date;
import java.sql.SQLException;

import br.com.luz.DAO.TimeRotaDAO;
import br.com.luz.model.TimeRota;

public class ServicoTimeRota extends TimeRotaDAO {
	private static TimeRotaDAO timeRota = new TimeRotaDAO();
	private static Scanner scan = new Scanner(System.in);
	
	public static void consultaTimeRota() {
		System.out.print("Digite o id de timeRota: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(timeRota.selectTimeRota(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirTimeRota() {
		System.out.print("Funcionário(ID): ");
		int funcionarioId = scan.nextInt();
		
		
		System.out.print("\nTarefa Rota(ID): ");
		int tarefaRotaId = scan.nextInt();
		scan.nextLine();
		
		TimeRota timeRotaIn = new TimeRota(0, funcionarioId, tarefaRotaId);
		
		try {
			timeRota.insertTimeRota(timeRotaIn);
		} finally {
			//
		}
	}
	
	public static void alterarTimeRota() throws SQLException {
		System.out.println("Qual o id do timeRota: ");
		int id = scan.nextInt();
		
		TimeRota timeRotaId = timeRota.selectTimeRota(id);
		
		System.out.println(timeRotaId);
		
		System.out.print("Funcionário (ID): ");
		timeRotaId.setFuncionarioId(scan.nextInt());
		
		System.out.print("\nTarefa Rota(ID): ");
		timeRotaId.setTarefaRotaId(scan.nextInt());
		
		try {
			timeRota.updateTimeRota(timeRotaId);
		} finally {
			//
		}
	}
	
	public static void deletarTimeRota() throws SQLException {
		System.out.print("Digite o id do timeRota: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(timeRota.deleteTimeRota(id));
	}

}