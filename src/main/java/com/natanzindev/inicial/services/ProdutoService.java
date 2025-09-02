package com.natanzindev.inicial.services;

import org.springframework.stereotype.Component;

import com.natanzindev.inicial.model.Produto;

@Component // Significa que o ciclo de vida dela será gerido pela jvm instalado no tomcat
public class ProdutoService implements IProdutoService{

	@Override
	public Produto desconto(Produto p, double v) {
		p.setPreco(p.getPreco()-(p.getPreco() * v / 100));
		return p;
	}

}
