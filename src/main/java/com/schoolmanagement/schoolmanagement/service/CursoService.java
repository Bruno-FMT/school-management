package com.schoolmanagement.schoolmanagement.service;

import com.schoolmanagement.schoolmanagement.model.AlunoModel;
import com.schoolmanagement.schoolmanagement.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CursoService {

    private final AlunoService aluno;

    public CursoService(AlunoService aluno) {
        this.aluno = aluno;
    }

    public CursoModel cadastrar(CursoModel curso) throws Exception {
        if (autenticar(curso))
            return CursoModel.adicionarCurso(curso);
        return null;
    }

    public void consultar(){
        CursoModel.listarCursos();
    }

    private boolean autenticar(CursoModel curso) throws Exception {
        if (curso.getNome() == null || curso.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório!");
        }

        if (curso.getCargaHoraria() == null) {
            throw new Exception("Carga horária é obrigatório!");
        }

        return true;
    }

}
