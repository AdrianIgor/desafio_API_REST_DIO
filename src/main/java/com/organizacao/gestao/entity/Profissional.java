package com.organizacao.gestao.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Profissional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20, nullable = false)
	private String cargo;
	
	@Column(nullable = false)
	private String diaContrato;
	
	@Column(nullable = false)
	private double salario;
	
	@Column(nullable = false)
	private Person person;
	
	@Column(nullable = false)
	private Address address;
	
}
