package models;

public class CarrinhoCompraItens {

	private CarrinhoCompra carrinhoCompra;
	private Produto produto;
	private Double quantidade;
	private Double valorUnitario;

	public CarrinhoCompra getCarrinhoCompra() {
		return carrinhoCompra;
	}

	public void setCarrinhoCompra(CarrinhoCompra carrinhoCompra) {
		this.carrinhoCompra = carrinhoCompra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
