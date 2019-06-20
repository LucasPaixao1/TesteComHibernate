package com.majority.executaveis;

import java.util.Scanner;

import com.majority.dao.UsuarioDAO;
import com.majority.modelos.Usuario;

public class Index {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		UsuarioDAO dao = new UsuarioDAO();
		boolean res = dao.verificaExistencia();

		Scanner s = new Scanner(System.in);

		System.out.println("\n\n\n\n\n");
		if (res) {

			CadastroDeUsuario.main(args);

		} else {

			System.out.print("Login: ");
			usuario.setLogin(s.next());

			System.out.print("Senha: ");
			usuario.setSenha(s.next());

			if (dao.verificaUsuario(usuario)) {

				MenuPrincipal.main(args);

			} else {

				System.err.println("Seu login ou senha est� incorreto");

			}

		}
	}

}
