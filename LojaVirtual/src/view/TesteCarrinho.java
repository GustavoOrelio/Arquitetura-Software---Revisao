package view;

import controller.CarrinhoControle;
import models.CarrinhoCompra;
import models.Cliente;
import models.Produto;

public class TesteCarrinho {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("00512453");
		cliente.setNome("Maria");
		
		Produto produto1 = new Produto();
		produto1.setDescricao("Mouse Gamer");
		produto1.setEstoque(9.);
		produto1.setValorVenda(99.);
		
		Produto produto2 = new Produto();
		produto2.setDescricao("Teclado Semi-Mecânico");
		produto2.setEstoque(5.);
		produto2.setValorVenda(199.);
		
		CarrinhoCompra carrinho = new CarrinhoCompra();
		carrinho.setCliente(cliente);
		
		CarrinhoControle carrinhoControle = new CarrinhoControle();
		carrinhoControle.adicionarItem(carrinho, produto1, 33., 2.);
		carrinhoControle.adicionarItem(carrinho, produto2, 70., 3.);
		System.out.println(carrinhoControle);
		
	}

}
