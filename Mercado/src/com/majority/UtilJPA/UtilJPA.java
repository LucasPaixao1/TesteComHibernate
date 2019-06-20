package com.majority.UtilJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mercado-mysql");
	
	public EntityManager getEntityManager() {

		return emf.createEntityManager();
	}
}
