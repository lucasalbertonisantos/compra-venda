package br.com.compravenda.webservice;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.compravenda.entidade.Produto;
import br.com.compravenda.entidade.ProdutoVendido;
import br.com.compravenda.entidade.Venda;

@RestController
@RequestMapping("/venda")
public class VendaWebService {
	
	@GetMapping("buscar-venda")
	public Venda buscarVendas() {
		Venda venda = new Venda();
		venda.setId(1L);
		venda.setValorTotal(100);
		venda.setData(new Date());
		venda.setProdutos(new ArrayList<>());
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Televisão");
		produto1.setDescricao("Aparelho eletrônico mais avançado do momento de 90 polegadas 4K com 3D");
		produto1.setValorCompra(10000.0);
		produto1.setValorVenda(20000.0);
		ProdutoVendido produtoVenda1 = new ProdutoVendido();
		produtoVenda1.setId(1L);
		produtoVenda1.setProduto(produto1);
		produtoVenda1.setQuantidade(1L);
		produtoVenda1.setValor(produto1.getValorVenda());
		venda.getProdutos().add(produtoVenda1);
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Batedeira Elétrica");
		produto2.setDescricao("Sua cozinha magnifica com a nossa batedeira elétrica!");
		produto2.setValorCompra(20.0);
		produto2.setValorVenda(50.0);
		ProdutoVendido produtoVenda2 = new ProdutoVendido();
		produtoVenda2.setId(2L);
		produtoVenda2.setProduto(produto2);
		produtoVenda2.setQuantidade(1L);
		produtoVenda2.setValor(produto2.getValorVenda());
		venda.getProdutos().add(produtoVenda2);
		return venda;
	}
	
	@PostMapping("vender")
	public Venda vender(@RequestBody Venda venda) {
		return venda;
	}

	

}
