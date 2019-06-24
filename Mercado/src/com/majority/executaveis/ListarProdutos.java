package com.majority.executaveis;

import java.util.List;
import java.util.Scanner;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class ListarProdutos {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("===================");
		System.out.println("* Listar Produtos *");
		System.out.println("===================");

		System.out.println();
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.listarProdutos();

		System.out.println();
		
		if (!produtos.isEmpty()) {
			for (Produto produto : produtos) {
				System.out.println("==============================================");
				System.out.println("Id: " + produto.getId());
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Marca: " + produto.getMarca());
				System.out.println("Categoria: " + produto.getCategoria());
				System.out.println("Tipo de Calculo: " + produto.getTipoCalculo());
				System.out.println("Valor por " + produto.getTipoCalculo() + ": " + produto.getValor());
				System.out.println("==============================================");

			}
		}else {
			System.out.println("Não há Produtos Cadastrados");
			
		}
				
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
