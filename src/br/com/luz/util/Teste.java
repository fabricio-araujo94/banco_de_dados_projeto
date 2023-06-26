package br.com.luz.util;

import java.sql.Timestamp;
import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;

import br.com.luz.DAO.*;
import br.com.luz.model.*;
import br.com.luz.servico.*;

public class Teste {

    public static void main(String[] args) throws SQLException, Exception {
    	
    	
    	
    	
    	ServicoContaDeLuz contaS = new ServicoContaDeLuz();
    	
    	ContaDeLuz conta = contaS.gerarContaDeLuz(1);
    	
    	System.out.println(conta);

    	
    	
    	
    	/*
        //count
        System.out.println(marcaDAO.count());
        
        //salvar
         marca = new ("Citroen");
        marcaDAO.insert(marca);

        //buscar por ID
        marca = marcaDAO.select(2);
        System.out.println(marca);

        //Update
        marca.setDescricao("Volt");
        marcaDAO.update(marca);
        marca = marcaDAO.select(2);
        System.out.println(marca);

        //Select all
        List<> marcas = marcaDAO.selectAlls();
        marcas.forEach(System.out::println);

        //Delete
        marcaDAO.delete(2);
        marcaDAO.selectAlls().forEach(System.out::println);

        System.out.println(new Gson().toJson(marca));
        */
    }
}
