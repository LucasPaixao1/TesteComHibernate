package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.EstoqueDAO;
import com.majority.modelos.Produto;

public class RegistrarEntrada {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String resposta = "";

		do {

			Produto produto = new Produto();

			System.out.println("================================");
			System.out.println("* Registrar Entrada no Estoque *");
			System.out.println("================================");

			System.out.print("\nInforme o Id do Produto: ");
			produto.setId(s.nextInt());

			System.out.print("\nInforme a Quantidade Comprada em Unidade ou Peso: ");
			produto.setQuantidade(s.nextBigDecimal());

			System.out.println();

			EstoqueDAO estoque = new EstoqueDAO();
			estoque.registrarEntada(produto);

			System.out.print("\nDeseja voltar ao menu principal? (S) para SIM (N) para NÃO: ");
			resposta = s.next().toUpperCase();

			if (resposta.equals("S")) {
				MenuPrincipal.main(args);
			} else {
				System.out.println();
				System.out.println(
						"==============================================================================================================");
				System.out.println();
			}
		} while (resposta.equals("N"));

		s.close();
	}

}
