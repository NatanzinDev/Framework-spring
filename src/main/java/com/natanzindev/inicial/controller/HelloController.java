package com.natanzindev.inicial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  torna a classe um Controller REST
public class HelloController {
	
	@GetMapping("/hello") // utiliza o metódo get para indicar o caminho da url - localhost:8080/hello
	public String hello() {
		return "Hello World!"; 
	}
	
}
