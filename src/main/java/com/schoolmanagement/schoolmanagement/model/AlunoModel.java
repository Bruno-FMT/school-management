package com.schoolmanagement.schoolmanagement.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
public class AlunoModel {

    @Setter(AccessLevel.NONE) private static int id;

    @Getter private static ArrayList<AlunoModel> listaAlunos = new ArrayList<>();

    private String nome;
    private String data_nascimento;
    private String naturalidade;

    private static int nextID = 1;


    private static int setNewID(){
        return nextID++;
    }

    public static AlunoModel adicionarAluno(AlunoModel aluno){
        AlunoModel.id = setNewID();
        listaAlunos.add(aluno);
        return aluno;
    }

    public static void listarAlunos(){
        for ( AlunoModel aluno : listaAlunos){
            System.out.printf(
                    "| %03d | %-30s | %-11s | %-20s |",
                    aluno.id,
                    aluno.getNome(),
                    aluno.getData_nascimento(),
                    aluno.getNaturalidade()
            );
        }
    }
}
