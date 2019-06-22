package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class ExcluirProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner s = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("* Excluir Produto *");
		System.out.println("===================");
		
		System.out.print("\nInforme o id do produto: ");
		produto.setId(s.nextInt());
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluirProduto(produto);
		
		s.close();

	}

}
