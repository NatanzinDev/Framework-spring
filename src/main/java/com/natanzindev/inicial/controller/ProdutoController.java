package com.natanzindev.inicial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natanzindev.inicial.model.Produto;
import com.natanzindev.inicial.services.IProdutoService;
import com.natanzindev.inicial.services.ProdutoService;

@RestController
public class ProdutoController {

	// IProdutoService ips = new ProdutoService(); Instâcia feita por mim, faz com
	// que a jvm aloque memoria para esta instancia

	@Autowired
	IProdutoService ips; // Injeção de dependencia, ele vai buscar alguma classe que implementa dessa
							// interface que esteja anotado com @Component, se houver algum objeto com
							// instacia disso ele vai usar, se não tiver vai ser criado

	@GetMapping("/produto")
	public Produto recuperarProduto() {
		Produto prod = new Produto();
		prod.setDescricao("Mouse gamer");
		prod.setId(1);
		prod.setPreco(2500.0);
		prod = ips.desconto(prod, 10);
		return prod;
	}

	@PostMapping("/novoproduto")
	public String novoproduto(@RequestBody Produto prod) {
		System.out.println("Descrição: " + prod.getDescricao() + " Preço: " + prod.getPreco());
		return "Deu certo";
	}

}
