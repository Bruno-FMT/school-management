package com.school.management.controllers;

import com.school.management.models.AlunoModel;
import com.school.management.services.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public AlunoModel post(@RequestBody AlunoModel aluno) throws Exception {
        return alunoService.salvar(aluno);
    }

    @GetMapping
    public ArrayList<AlunoModel> get(){
        return alunoService.listar();
    }
}
