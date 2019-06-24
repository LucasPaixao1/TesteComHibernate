package com.majority.executaveis;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println();
		System.out.println("==============================================================================================================");
		System.out.println();
		
		System.out.println("====================================");
		System.out.println("|         Menu Principal           |");
		System.out.println("====================================");
		System.out.println("| 1 - Cadastro de Produto          |");
		System.out.println("| 2 - Alterar Valor do Produto     |");
		System.out.println("| 3 - Excluir Produto              |");
		System.out.println("| 4 - Listar Produtos              |");
		System.out.println("| 5 - Registrar Entrada no Estoque |");
		System.out.println("| 6 - Registrar Venda              |");
		System.out.println("| 7 - Listar Vendas                |");
		System.out.println("| 8 - Estoque                      |");
		System.out.println("| 0 - Sair                         |");
		System.out.println("====================================");

		System.out.print("\nInforme a opção desejada: ");
		int opcao = s.nextInt();
		
		System.out.println();
		System.out.println("==============================================================================================================");
		System.out.println();
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
				RegistrarEntrada.main(args);
				break;
			case 6:
				RegistrarVenda.main(args);
				break;
			case 7:
				ListarVendas.main(args);
				break;
			case 8:
				Estoque.main(args);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
		}

		s.close();

	}

}
