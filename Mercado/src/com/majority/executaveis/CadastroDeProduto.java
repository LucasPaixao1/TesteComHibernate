package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.ProdutoDAO;
import com.majority.modelos.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		Scanner s = new Scanner(System.in);
		
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
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.cadastroProduto(produto);
		
		s.close();
		
	}

}
