package com.majority.dao;

import javax.persistence.EntityManager;

import com.majority.UtilJPA.UtilJPA;
import com.majority.executaveis.Index;
import com.majority.modelos.Usuario;
import com.majority.validadores.ValidaUsuario;

public class UsuarioDAO {
	
	private EntityManager em;
	
	public UsuarioDAO(){
		em = new UtilJPA().getEntityManager();
		em.getTransaction().begin();
	}
	
	public boolean verificaExistencia() {

		Usuario usuario= em.find(Usuario.class, 1);
		ValidaUsuario validaUsuario = new ValidaUsuario();
		
		return validaUsuario.validaUsuario(usuario);
		
	}
	
	public boolean verificaUsuario(Usuario usuario) {
		
		boolean retorno = false;
		
		Usuario user = em.find(Usuario.class, 1);
		
		if(usuario.getLogin().equals(user.getLogin()) && usuario.getSenha().equals(user.getSenha())) {
			
			retorno = true;
		}
		
		return retorno;
		
	}

	public void cadastraUsuario(Usuario usuario) {
		
		em.persist(usuario);
		em.getTransaction().commit();
		
		System.out.println("\n=====================================");
		System.out.println("* Usuário Cadastrado com Sucesso!!! *");
		System.out.println("=====================================\n");
		
		System.out.println("==================================================");
		System.out.println();
		
		Index.main(null);
	}
	
	

}
