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

		System.out.println();
		if (res) {

			CadastroDeUsuario.main(args);

		} else {

			System.out.println("==========");
			System.out.println("* Login *");
			System.out.println("==========\n");
			
			System.out.print("Login: ");
			usuario.setLogin(s.next());

			System.out.print("Senha: ");
			usuario.setSenha(s.next());

			if (dao.verificaUsuario(usuario)) {

				try {
					limpaTela();
				} catch (Exception e) {
					e.printStackTrace();
				}

				MenuPrincipal.main(args);

			} else {

				System.err.println("Seu login ou senha está incorreto");

			}

		}
		
		s.close();
	}

	public static void limpaTela() throws Exception {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	}

}
