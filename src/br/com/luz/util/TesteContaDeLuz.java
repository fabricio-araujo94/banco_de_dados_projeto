package br.com.luz.util;

import br.com.luz.servico.ServicoContaDeLuz;

import com.google.gson.Gson;

public class TesteContaDeLuz {
	public static void main(String[] args) {
		ServicoContaDeLuz contaDeLuz = new ServicoContaDeLuz();
		
		System.out.println(new Gson().toJson(contaDeLuz.gerarContaDeLuz(1, "03", "2020")));
		System.out.println(new Gson().toJson(contaDeLuz.gerarContaDeLuz(2, "03", "2020")));
		System.out.println(new Gson().toJson(contaDeLuz.gerarContaDeLuz(1, "05", "2018")));
		System.out.println(new Gson().toJson(contaDeLuz.gerarContaDeLuz(1, "08", "2022")));
		System.out.println(new Gson().toJson(contaDeLuz.gerarContaDeLuz(1, "01", "2020"))); // Esse é pra dar null
	}
}
