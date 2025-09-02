package com.natanzindev.inicial.services;

import com.natanzindev.inicial.model.Produto;

public interface IProdutoService {
	
	public Produto desconto(Produto p, double v);
}
