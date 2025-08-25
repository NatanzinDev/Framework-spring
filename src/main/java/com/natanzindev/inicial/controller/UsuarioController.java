package com.natanzindev.inicial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natanzindev.inicial.model.Usuario;

@RestController
public class UsuarioController {
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {
		System.out.println("Dados recebidos: " + dadosLogin.getEmail() +","+ dadosLogin.getSenha());
		
		if(dadosLogin.getEmail().equals("natan@natan.com")) {
			if(dadosLogin.getSenha().equals("123456")) {
				Usuario resposta = new Usuario();
				resposta.setId(555);
				resposta.setEmail(dadosLogin.getEmail());
				resposta.setSenha("******");
				resposta.setNome("natan");
				return ResponseEntity.ok(resposta);
			}
			
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.status(404).build();
	}
}
