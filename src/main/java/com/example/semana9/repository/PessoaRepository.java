package com.example.semana9.repository;

import com.example.semana9.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    //List<PessoaEntity> buscarPessoas(Long id);

    List<PessoaEntity> findByStatus(Boolean status);

    @Query("select * from PessoaEntity p where p.name like %?1% or p.email like %?1%")
    List<PessoaEntity> findAllFilter(String s);

}
