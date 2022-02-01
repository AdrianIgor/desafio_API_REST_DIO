package com.organizacao.gestao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organizacao.gestao.entity.Address;
import com.organizacao.gestao.entity.Person;
import com.organizacao.gestao.entity.Profissional;
import com.organizacao.gestao.repository.ProfissionalRepository;

import lombok.NonNull;

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
	
	@PostMapping("/post")
	public String setProfissional(@RequestBody Profissional profissional) {
		repository.save(profissional);
		return "Registro criado com sucesso!";
	}
	
	@PutMapping("/put")
	public String upProfissional(@RequestBody Profissional profissional) {
		Profissional p = profissional;
		repository.save(p);
		return "Registro atualizado com sucesso!";
	}
	
	@DeleteMapping("/delete")
	public String delProfissional(@RequestBody Profissional profissional) {
		repository.deleteById(profissional.getId());
		return "Registro deletado com sucesso!";
	}
	
}
