package com.example.semana9.controller;

import com.example.semana9.entity.PessoaEntity;
import com.example.semana9.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<PessoaEntity> search() {
        return this.service.buscarPessoas();
    }

}
