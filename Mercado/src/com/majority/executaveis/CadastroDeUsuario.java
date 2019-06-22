package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.UsuarioDAO;
import com.majority.modelos.Usuario;

public class CadastroDeUsuario {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Scanner s = new Scanner(System.in);
		
		System.out.print("=======================\n"
						  +"* Cadastro de usuario *\n"
						  +"=======================\n"
						  + "\nInforme seu login: "
						  );
		usuario.setLogin(s.next());
		
		System.out.print("\nInforme sua senha: ");
		usuario.setSenha(s.next());
		
		System.out.print("\nConfirme sua senha: ");
		String senha2 = s.next();
		
		UsuarioDAO dao = new UsuarioDAO();
		
		if(senha2.equals(usuario.getSenha())) {
			
			dao.cadastraUsuario(usuario);
			
		}
		
		s.close();
		

	}

}
