package controller;

import java.util.ArrayList;
import java.util.List;

import models.CarrinhoCompra;
import models.CarrinhoCompraItens;
import models.Produto;

public class CarrinhoControle {

	private List<CarrinhoCompraItens> carrinhoItens = new ArrayList<CarrinhoCompraItens>();

	public void adicionarItem(CarrinhoCompra carrinho, Produto Produto, Double valorUnitario, Double quantidade) {
		CarrinhoCompraItens itens = new CarrinhoCompraItens();
		itens.setProduto(Produto);
		itens.setCarrinhoCompra(carrinho);
		itens.setQuantidade(quantidade);
		itens.setValorUnitario(valorUnitario);
		carrinhoItens.add(itens);
	}

	public void removerItem() {

	}
	
	@Override
	public String toString() {
		//descricao de cada produto
		//quantidade adicionada
		//valor unitario
		//valor total
		//mostrar o cliente
		return "";
	}

}
