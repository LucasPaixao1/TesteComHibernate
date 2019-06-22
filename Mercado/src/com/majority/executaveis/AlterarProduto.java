package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class AlterarProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		Scanner s = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("* Alterar Produto *");
		System.out.println("===================");
		
		System.out.print("\nInforme o id do produto: ");
		produto.setId(s.nextInt());
		
		System.out.print("\nInforme o novo valor do produto: ");
		produto.setValor(s.nextBigDecimal());
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.alterarProduto(produto);
		
		s.close();
	}

}
