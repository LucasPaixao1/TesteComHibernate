package com.majority.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.majority.UtilJPA.UtilJPA;
import com.majority.modelos.Produto;
import com.majority.modelos.Venda;

public class EstoqueDAO {

	private EntityManager em;

	public EstoqueDAO() {
		em = new UtilJPA().getEntityManager();
		em.getTransaction().begin();
	}

	public void registrarEntada(Produto produto) {
		Produto produtoPesquisado = em.find(Produto.class, produto.getId());

		produtoPesquisado.setQuantidade(produto.getQuantidade());

		em.getTransaction().commit();

		System.out.println("\n=====================================");
		System.out.println("* Entrada Registrada com Sucesso!!! *");
		System.out.println("=====================================\n");

	}

	public void registrarVenda(Venda venda) {
		
		Produto produto = venda.getProduto();
		Produto produtoPesquisado = em.find(Produto.class, produto.getId());
		
		BigDecimal quantVendida = venda.getQuantidade();
		BigDecimal valorProduto = produtoPesquisado.getValor();
		
		venda.setValorVenda(quantVendida.multiply(valorProduto));
		
		produtoPesquisado.setQuantidade(produtoPesquisado.getQuantidade().subtract(quantVendida));
		
		em.persist(venda);
		em.getTransaction().commit();
		
		System.out.println("\n===================================");
		System.out.println("* Venda Registrada com Sucesso!!! *");
		System.out.println("===================================");
	}

}
