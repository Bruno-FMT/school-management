package com.school.management.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

public class AlunoModel {

    private static Integer nextId = 1;
    @Getter private static ArrayList<AlunoModel> listaAlunos = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    @Getter
    private Integer id;
    @Setter
    @Getter
    private String nome;
    @Setter
    @Getter
    private LocalDate data_nascimento;
    @Setter
    @Getter
    private String naturalidade;

    private static Integer getNextId(){ return nextId++; }

    public static AlunoModel adicionarLista(AlunoModel aluno){
        aluno.id = getNextId();
        listaAlunos.add(aluno);
        return aluno;
    }

    public static AlunoModel buscarPorId(Integer id) throws Exception {
        for (AlunoModel aluno: listaAlunos){
            if (aluno.getId().equals(id))
                return aluno;
        }
        throw new Exception("Aluno não encontrado");
    }

}
