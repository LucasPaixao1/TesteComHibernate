package com.majority.dao;

import javax.persistence.EntityManager;

import com.majority.UtilJPA.UtilJPA;

public class ValidacoesDAO {
private EntityManager em;
	
	public ValidacoesDAO(){
		em = new UtilJPA().getEntityManager();
		em.getTransaction().begin();
	}
}
