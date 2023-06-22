package br.com.luz.servico;

import br.com.luz.DAO.TarefaRotaDAO;
import br.com.luz.model.TarefaRota;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServicoTarefaRota extends TarefaRotaDAO {
	private static TarefaRotaDAO tarefaRota = new TarefaRotaDAO();
	private static Scanner scan = new Scanner(System.in);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void consultaTarefaRota() throws Exception {
		System.out.print("Digite o id da Tarefa: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(tarefaRota.selectTarefaRota(id));
	}
	
	public static void inserirTarefaRota() throws Exception {
		System.out.print("Observação: ");
		String observacao = scan.next();
		scan.nextLine();
		
		System.out.print("\nData de Início: ");
		String data = scan.next();
		Date dataCon = dateFormat.parse(data);
		Timestamp dataInicio = new Timestamp(dataCon.getTime());
		scan.nextLine();
		
		System.out.print("\nData do Fim: ");
		data = scan.next();
		dataCon = dateFormat.parse(data);
		Timestamp dataFim = new Timestamp(dataCon.getTime());
		scan.nextLine();
		
		System.out.print("\nRota(ID): ");
		int rotaId = scan.nextInt();
		
		TarefaRota tarefaRotaIn = new TarefaRota(0, observacao, dataInicio, dataFim, rotaId);
		
		try {
			tarefaRota.insertTarefaRota(tarefaRotaIn);
		} finally {
			System.out.println("POSTE ADICIONADO COM SUCESSO");
		}
	}
	
	public static void alterarTarefaRota() throws SQLException, Exception {
		System.out.println("Qual o id da Tarefa: ");
		int id = scan.nextInt();
		
		TarefaRota tarefaRotaId = tarefaRota.selectTarefaRota(id);
		
		System.out.println(tarefaRotaId);
		
		System.out.print("Observação: ");
		tarefaRotaId.setObservacao(scan.next());
		scan.nextLine();
		
		System.out.print("\nData de Início: ");
		String data = scan.next();
		Date dataCon = dateFormat.parse(data);
		Timestamp dataInicio = new Timestamp(dataCon.getTime());
		tarefaRotaId.setDataInicio(dataInicio);
		scan.nextLine();
		
		System.out.print("\nData de Fim: ");
		data = scan.next();
		dataCon = dateFormat.parse(data);
		Timestamp dataFim = new Timestamp(dataCon.getTime());
		tarefaRotaId.setDataFim(dataFim);
		scan.nextLine();
		
		System.out.print("\nTipo Rota(ID): ");
		tarefaRotaId.setRotaId(scan.nextInt());
		
		try {
			tarefaRota.updateTarefaRota(tarefaRotaId);
		} finally {
			//
		}
	}
	
	public static void deletarTarefaRota() throws SQLException {
		System.out.print("Digite o id do tarefaRota: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(tarefaRota.deleteTarefaRota(id));
	}
}
