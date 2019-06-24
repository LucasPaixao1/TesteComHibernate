package com.majority.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.majority.UtilJPA.UtilJPA;
import com.majority.executaveis.MenuPrincipal;
import com.majority.modelos.Produto;

public class ProdutoDAO {
	
	private EntityManager em;
	
	public ProdutoDAO(){
		em = new UtilJPA().getEntityManager();
		em.getTransaction().begin();
	}

	public void cadastroProduto(Produto produto) {
		em.persist(produto);
		em.getTransaction().commit();
		
		System.out.println("\n====================================");
		System.out.println("* Cadastro Efetuado com Sucesso!!! *");
		System.out.println("====================================\n");
		
		//MenuPrincipal.main(null);
	}

	public void alterarProduto(Produto produto) {

		Produto produtoOriginal = em.find(Produto.class, produto.getId());
		produtoOriginal.setValor(produto.getValor());
		em.getTransaction().commit();
		
		System.out.println("\n===================================");
		System.out.println("* Produto Alterado com Sucesso!!! *");
		System.out.println("===================================\n");

	}

	public void excluirProduto(Produto produto) {
		Produto produtoOriginal = em.find(Produto.class, produto.getId());
		em.remove(produtoOriginal);
		em.getTransaction().commit();
		
		System.out.println("\n===================================");
		System.out.println("* Produto Excluido com Sucesso!!! *");
		System.out.println("===================================\n");
		
	}

	public List<Produto> listarProdutos() {

		Query query = em.createQuery("select p from Produto p");
		List<Produto> produtos = query.getResultList();
		
		return produtos;
	}

}
