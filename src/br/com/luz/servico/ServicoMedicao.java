package br.com.luz.servico;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.luz.DAO.MedicaoDAO;
import br.com.luz.model.Medicao;

public class ServicoMedicao extends MedicaoDAO {
	private static MedicaoDAO medicao = new MedicaoDAO();
	private static Scanner scan = new Scanner(System.in);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void consultaMedicao() {
		System.out.print("Digite o id do medição: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		try {
			System.out.println(medicao.selectMedicao(id));
		} finally {
			System.out.println("CONSULTA ENCERRADA");
		}
	}
	
	public static void inserirMedicao() throws ParseException {
		System.out.print("\nMês: ");
		String mes = scan.next();
		scan.nextLine();
		
		System.out.print("\nAno: ");
		String ano = scan.next();
		scan.nextLine();
		
		System.out.print("\nData da Medição: ");
		String data = scan.next();
		Date dataCon = dateFormat.parse(data);
		Timestamp dataMedicao = new Timestamp(dataCon.getTime());
		scan.nextLine();
		
		System.out.print("\nConsumo: ");
		String consumo = scan.next();
		scan.nextLine();
		
		System.out.print("\nMedidor(ID): ");
		int medidor = scan.nextInt();
		scan.nextLine();
		
		System.out.print("\nTime Rota(ID): ");
		int timeRota = scan.nextInt();
		scan.nextLine();
		
		Medicao medicaoIn = new Medicao(0, mes, ano, dataMedicao, consumo, medidor, timeRota);
		
		try {
			medicao.insertMedicao(medicaoIn);
		} finally {
			//
		}
	}
	
	public static void alterarMedicao() throws SQLException, ParseException {
		System.out.println("Qual o id do medicao: ");
		int id = scan.nextInt();
		
		Medicao medicaoId = medicao.selectMedicao(id);
		
		System.out.println(medicaoId);
		
		System.out.print("Mês: ");
		medicaoId.setMes(scan.next());
		scan.nextLine();
		
		System.out.print("\nAno: ");
		medicaoId.setAno(scan.next());
		scan.nextLine();
		
		System.out.print("\nData da Medição: ");
		String data = scan.next();
		Date dataCon = dateFormat.parse(data);
		medicaoId.setDataMedicao(new Timestamp(dataCon.getTime()));
		scan.nextLine();
		
		System.out.print("\nConsumo: ");
		medicaoId.setConsumo(scan.next());
		scan.nextLine();
		
		System.out.print("\nMedidor(ID): ");
		medicaoId.setMedidorId(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nTime Rota(ID): ");
		medicaoId.setTimeRotaId(scan.nextInt());
		scan.nextLine();
		
		try {
			medicao.updateMedicao(medicaoId);
		} finally {
			//
		}
	}
	
	public static void deletarMedicao() throws SQLException {
		System.out.print("Digite o id do medicao: ");
		int id = scan.nextInt();
		
		System.out.println();
		
		System.out.println(medicao.deleteMedicao(id));
	}

}
