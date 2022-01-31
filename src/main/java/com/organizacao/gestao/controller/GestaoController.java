package com.organizacao.gestao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organizacao.gestao.entity.Profissional;
import com.organizacao.gestao.repository.ProfissionalRepository;

@RestController
@RequestMapping("/")
public class GestaoController {

	private ProfissionalRepository repository;
	
	@Autowired
	public GestaoController(ProfissionalRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/pr")
	public List<Profissional> getProfissionais(){
		return repository.findAll();
	}
	
	@PostMapping
	public String setProfissional(@RequestBody Profissional profissional) {
		repository.save(profissional);
		return "Oi";
	}
	
}
