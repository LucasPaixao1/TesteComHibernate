package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.UsuarioDAO;
import com.majority.modelos.Usuario;

public class CadastroDeUsuario {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Scanner s = new Scanner(System.in);
		
		boolean confirmou = true;
		System.out.print("=======================\n"
						  +"* Cadastro de Usuario *\n"
						  +"=======================\n"
						  + "\nInforme seu login: "
						  );
		usuario.setLogin(s.next());
		
		System.out.print("\nInforme sua senha: ");
		usuario.setSenha(s.next());
		
		System.out.print("\nConfirme sua senha: ");
		String senha2 = s.next();
		
		System.out.println();
		
		UsuarioDAO dao = new UsuarioDAO();
		
		if(senha2.equals(usuario.getSenha())) {
			
			dao.cadastraUsuario(usuario);
			
		}else {
			
			System.out.println("As senhas não são iguais");
			confirmou = false;
			
		}
		
		s.close();
		

	}

}
