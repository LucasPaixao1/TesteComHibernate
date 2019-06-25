package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class ExcluirProduto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String resposta = "";

		do {
			Produto produto = new Produto();
			
			System.out.println("===================");
			System.out.println("* Excluir Produto *");
			System.out.println("===================");

			System.out.print("\nInforme o id do produto: ");
			produto.setId(s.nextInt());

			System.out.println();

			ProdutoDAO dao = new ProdutoDAO();
			dao.excluirProduto(produto);

			System.out.print("\nDeseja voltar ao menu principal? (S) para SIM (N) para NÃO: ");
			resposta = s.next().toUpperCase();

			if (resposta.equals("S")) {
				System.out.println();
				System.out.println(
						"==============================================================================================================");
				System.out.println();

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
