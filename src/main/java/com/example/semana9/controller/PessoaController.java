package com.example.semana9.controller;

import com.example.semana9.entity.PessoaEntity;
import com.example.semana9.service.PessoaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }
    @PostMapping
    public PessoaEntity insert(@RequestBody PessoaEntity pessoa) {
        return this.service.savePessoa(pessoa);
    }

}
