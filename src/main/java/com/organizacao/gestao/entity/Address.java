package com.organizacao.gestao.entity;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Address {
	
	@Column(nullable = false)
	private String rua;
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private String complemento;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String estado;

}
