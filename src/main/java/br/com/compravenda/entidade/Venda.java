package br.com.compravenda.entidade;

import java.util.List;

public class Venda extends Movimento {
	
	private List<ProdutoVendido> produtos;

	public List<ProdutoVendido> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ProdutoVendido> produtos) {
		this.produtos = produtos;
	}

}
