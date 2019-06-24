package com.majority.executaveis;

import java.util.Calendar;
import java.util.Scanner;

import com.majority.dao.EstoqueDAO;
import com.majority.modelos.Produto;
import com.majority.modelos.Venda;

public class RegistrarVenda {

	public static void main(String[] args) {

		Venda venda = new Venda();
		Produto produto = new Produto();
		Scanner s = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("* Registrar Venda *");
		System.out.println("===================");

		System.out.print("\nInforme o Id do Produto: ");
		produto.setId(s.nextInt());
		
		System.out.print("\nInforme a Quantidade Vendida em Peso ou Unidade: ");
		venda.setQuantidade(s.nextBigDecimal());
		
		venda.setProduto(produto);
		venda.setDataVenda(Calendar.getInstance());
		
		System.out.println();
		
		EstoqueDAO dao = new EstoqueDAO();
		dao.registrarVenda(venda);
		
		System.out.print("\nDeseja voltar ao menu principal? (S) para SIM (N) para NÃO: ");
		String resposta = s.next().toUpperCase();
		
		if(resposta.equals("S")) {
			System.out.println();
			System.out.println("==============================================================================================================");
			System.out.println();
			
			MenuPrincipal.main(args);
		}else {
			System.exit(0);
		}
		
		s.close();

	}

}
