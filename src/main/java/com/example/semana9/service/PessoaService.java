package com.example.semana9.service;

import com.example.semana9.entity.PessoaEntity;
import com.example.semana9.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }


    public PessoaEntity savePessoa(PessoaEntity pessoa) {
        PessoaEntity person = this.repository.save(pessoa);
        return person;
    }
}
