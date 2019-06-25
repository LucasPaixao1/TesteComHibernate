package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.UsuarioDAO;
import com.majority.modelos.Usuario;

public class CadastroDeUsuario {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Scanner s = new Scanner(System.in);
		String senha2 = "";

		boolean confirmou = true;

		do {
			System.out.print("=======================\n" 
						   + "* Cadastro de Usuario *\n" 
					       + "=======================\n"
					       + "\nInforme seu login: ");
			
			usuario.setLogin(s.next());

			System.out.print("\nInforme sua senha: ");
			usuario.setSenha(s.next());

			System.out.print("\nConfirme sua senha: ");
			senha2 = s.next();

			System.out.println();

			UsuarioDAO dao = new UsuarioDAO();

			if (senha2.equals(usuario.getSenha())) {

				dao.cadastraUsuario(usuario);

			} else {

				System.out.println("\nAs Senhas são Iguais");
				confirmou = false;
				System.out.println("\n==============================================================================================================");
				System.out.println();
				
			}
		} while (confirmou == false);

		s.close();

	}

}
