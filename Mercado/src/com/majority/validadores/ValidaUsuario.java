package com.majority.validadores;

import com.majority.modelos.Usuario;

public class ValidaUsuario {

	public boolean validaUsuario(Usuario usuario) {

		boolean retorno = false;

		try {
			
			if (usuario.getId() == null) {
				retorno = true;
			}
			
		} catch (NullPointerException e) {

			retorno = true;

		}

		return retorno;
	}
}
