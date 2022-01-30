package com.organizacao.gestao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class GestaoController {

	@GetMapping
	public String hello() {
		return "Olá";
	}
	
	
}
