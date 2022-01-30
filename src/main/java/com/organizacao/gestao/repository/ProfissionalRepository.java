package com.organizacao.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organizacao.gestao.entity.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
}
