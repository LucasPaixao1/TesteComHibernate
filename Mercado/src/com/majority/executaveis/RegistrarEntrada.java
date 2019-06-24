package com.majority.executaveis;

import java.util.Scanner;

import com.majority.modelos.EstoqueDAO;
import com.majority.modelos.Produto;

public class RegistrarEntrada {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("================================");
		System.out.println("* Registrar Entrada no Estoque *");
		System.out.println("================================");
		
		System.out.println("\nInforme o Id do Produto: ");
		produto.setId(s.nextInt());
		
		System.out.println("\nInforme a Quantidade Comprada em Unidade ou Peso: ");
		produto.setQuantidade(s.nextBigDecimal());
		
		System.out.println();
		
		EstoqueDAO estoque = new EstoqueDAO();
		estoque.registrarEntada(produto);
		
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
	}

}
