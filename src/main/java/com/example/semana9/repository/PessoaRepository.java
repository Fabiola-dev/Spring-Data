package com.example.semana9.repository;

import com.example.semana9.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    List<PessoaEntity> buscarPessoas(Long id);

}
