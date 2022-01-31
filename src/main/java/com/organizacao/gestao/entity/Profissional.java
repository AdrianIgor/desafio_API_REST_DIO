package com.organizacao.gestao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Profissional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20, nullable = false)
	private String cargo;
	
	@Column(length = 10, nullable = false)
	private String diaContrato;
	
	@Column(nullable = false)
	private double salario;
	
	@OneToOne
	private Person person;
	
	@OneToOne
	private Address address;
	
}
