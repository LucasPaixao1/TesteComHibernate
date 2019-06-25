package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String resposta = "";
		
		do {
			Produto produto = new Produto();
			
			System.out.println("=======================");
			System.out.println("* Cadastro de Produto *");
			System.out.println("=======================");

			System.out.print("\nInforme o nome do produto: ");
			produto.setNome(s.next());

			System.out.print("\nInforme a marca do produto: ");
			produto.setMarca(s.next());

			System.out.print("\nInforme a categoria do produto: ");
			produto.setCategoria(s.next());

			System.out.print("\nInforme o tipo de calculo do produto: ");
			produto.setTipoCalculo(s.next());

			System.out.print("\nInforme o valor do produto: ");
			produto.setValor(s.nextBigDecimal());

			System.out.println();

			ProdutoDAO dao = new ProdutoDAO();
			dao.cadastroProduto(produto);

			System.out.print("\nDeseja voltar ao menu principal? (S) para SIM (N) para NÃO: ");
			resposta = s.next().toUpperCase();

			if (resposta.equals("S")) {
				MenuPrincipal.main(args);
			}else {
				
				System.out.println();
				System.out.println(
						"==============================================================================================================");
				System.out.println();
				
			}

		} while (resposta.equals("N"));

		s.close();

	}

}
