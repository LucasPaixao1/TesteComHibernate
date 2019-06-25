package com.majority.executaveis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.majority.dao.EstoqueDAO;
import com.majority.modelos.Produto;
import com.majority.modelos.Venda;

public class ListarVendas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("=================");
		System.out.println("* Listar Vendas *");
		System.out.println("=================");

		System.out.println();
		
		EstoqueDAO dao = new EstoqueDAO();
		List<Venda> vendas = dao.listarVendas();

		System.out.println();
		
		if (!vendas.isEmpty()) {
			for (Venda venda : vendas) {
				
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				 
				Produto produto = venda.getProduto(); 
				
				Calendar calendar = venda.getDataVenda();
				
				System.out.println("==============================================");
				System.out.println("Id: " + venda.getId());
				System.out.println("Data da Venda: " + formato.format(calendar.getTime()));
				System.out.println("Valor da Venda: " + venda.getValorVenda());
				System.out.println("Quantidade Vendida: " + venda.getQuantidade());
				System.out.println("Id do Produto: " + produto.getId());
				System.out.println("==============================================");

			}
		}else {
			System.out.println("Não há Vendas Cadastradas");
			
		}
		
		System.out.print("\nDeseja voltar ao menu principal? (S) para SIM (N) para NÃO: ");
		String resposta = s.next().toUpperCase();
		
		if(resposta.equals("S")) {

			MenuPrincipal.main(args);
		}else {
			System.exit(0);
		}
		
		s.close();
			

	}

}
