package com.majority.modelos;

import javax.persistence.EntityManager;

import com.majority.UtilJPA.UtilJPA;

public class EstoqueDAO {

private EntityManager em;
	
	public EstoqueDAO(){
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

}
