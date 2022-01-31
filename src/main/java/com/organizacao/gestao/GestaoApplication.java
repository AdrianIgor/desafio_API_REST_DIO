package com.organizacao.gestao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories 
@SpringBootApplication
public class GestaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoApplication.class, args);
	}

}
