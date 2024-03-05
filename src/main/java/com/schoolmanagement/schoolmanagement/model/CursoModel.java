package com.schoolmanagement.schoolmanagement.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;

@Data
public class CursoModel {

    @Setter(AccessLevel.NONE) private static int id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    private static ArrayList<CursoModel> listaCursos = new ArrayList<>();
    private ArrayList<AlunoModel> alunosMatriculados = new ArrayList<>();

    private static int nextID = 1;

    private static int setNewID(){
        return nextID++;
    }

    public static CursoModel adicionarCurso(CursoModel curso){
        curso.id = setNewID();
        listaCursos.add(curso);
        return curso;
    }

    public static void listarCursos(){
        for ( CursoModel curso : listaCursos){
            System.out.printf(
                    "| %03d | %-30s | %-6d |",
                    curso.id,
                    curso.getNome(),
                    curso.getCargaHoraria()
            );
        }
    }

}
