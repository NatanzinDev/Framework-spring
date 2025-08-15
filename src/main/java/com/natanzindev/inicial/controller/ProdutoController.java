package com.natanzindev.inicial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natanzindev.inicial.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produto")
	public Produto recuperarProduto(){
		Produto prod = new Produto();
		prod.setDescricao("Mouse gamer");
		prod.setId(1);
		prod.setPreco(10.0);
		return prod;
	}
	
	@PostMapping("/novoproduto")
	public String novoproduto(@RequestBody Produto prod){
		System.out.println("Descrição: "+ prod.getDescricao()+" Preço: "+prod.getPreco());
		return "Deu certo";
	}
	
}
