package com.majority.executaveis;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("====================================");
		System.out.println("|         Menu Principal           |");
		System.out.println("====================================");
		System.out.println("| 1 - Cadastro de Produto          |");
		System.out.println("| 2 - Alterar Valor do Produto     |");
		System.out.println("| 3 - Excluir Produto              |");
		System.out.println("| 4 - Listar Produtos              |");
		System.out.println("| 5 - Registrar Entrada no Estoque |");
		System.out.println("| 6 - Registrar Venda              |");
		System.out.println("| 7 - Estoque                      |");
		System.out.println("| 0 - Sair                         |");
		System.out.println("====================================");

		System.out.println("\nInforme a opção desejada: ");
		int opcao = s.nextInt();

		switch (opcao) {
		
			case 1:
				CadastroDeProduto.main(args);
				break;
	
			case 2:
				AlterarProduto.main(args);	
				break;
			case 3:
				ExcluirProduto.main(args);
				break;
			case 4:
				ListarProdutos.main(args);
				break;
			case 5:
	
				break;
			case 6:
	
				break;
			case 7:
	
				break;
			case 0:
	
				break;
			default:
				break;
		}

		s.close();

	}

}
