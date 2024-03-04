package com.schoolmanagement.schoolmanagement.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class CursoModel {

    @Setter(AccessLevel.NONE) private static int id;
    private String nome;
    private String data_nascimento;
    private String descricao;
    private int cargaHoraria;

    private static int nextID = 1;

    private void setNewID(){
        nextID++;
    }
}
