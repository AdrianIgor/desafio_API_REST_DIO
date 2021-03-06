package com.organizacao.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organizacao.gestao.entity.Profissional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
}
