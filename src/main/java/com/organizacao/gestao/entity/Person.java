package com.organizacao.gestao.entity;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Person {

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, unique = true)
	private String cpf;
	
	@Column(nullable = false)
	private String dataNascimento;
	
	private enum Sexo { MASCULINO, FEMININO}
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	private String celular;
	
	
}
