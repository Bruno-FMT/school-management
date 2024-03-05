package com.schoolmanagement.schoolmanagement.service;

import com.schoolmanagement.schoolmanagement.model.AlunoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlunoService {

    public AlunoModel cadastrar(AlunoModel aluno) throws Exception {
        if (autenticar(aluno))
            return AlunoModel.adicionarAluno(aluno);
        return null;
    }

    public static ArrayList<AlunoModel> consultar(){
        return AlunoModel.listarAlunos();
    }

    public static boolean autenticar(AlunoModel aluno) throws Exception {
        if (aluno.getNome() == null || aluno.getNome().isBlank())
            throw new Exception("Nome é obrigatório!");

        if (aluno.getData_nascimento() == null || aluno.getData_nascimento().isBlank())
            throw new Exception("Data de nascimento é obrigatório!");

        return true;
    }
}
