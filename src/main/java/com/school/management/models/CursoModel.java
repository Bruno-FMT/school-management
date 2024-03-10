package com.school.management.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class CursoModel {

    private static Integer nextId = 1;
    @Getter private static ArrayList<CursoModel> listaCursos = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    @Getter
    private Integer id;
    @Setter
    @Getter
    private String nome;
    @Setter
    @Getter
    private String descricao;
    @Setter
    @Getter
    private Integer carga_horaria;

    private static Integer getNextId(){
        return nextId++;
    }

    public static CursoModel adicionarCurso(CursoModel curso){
        curso.id = getNextId();
        listaCursos.add(curso);
        return curso;
    }

}
