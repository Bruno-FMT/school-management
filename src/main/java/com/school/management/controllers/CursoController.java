package com.school.management.controllers;

import com.school.management.models.CursoModel;
import com.school.management.services.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public CursoModel post(@RequestBody CursoModel curso) throws Exception {
        return cursoService.salvar(curso);
    }

    @GetMapping
    public ArrayList<CursoModel> get(){
        return cursoService.listar();
    }
}
