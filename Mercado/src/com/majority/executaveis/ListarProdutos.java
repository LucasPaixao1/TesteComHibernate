package com.majority.executaveis;

import java.util.List;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class ListarProdutos {

	public static void main(String[] args) {

		System.out.println("===================");
		System.out.println("* Listar Produtos *");
		System.out.println("===================");

		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.listarProdutos();

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
			System.out.println("Não há produtos cadastrados");
			
		}

	}

}
