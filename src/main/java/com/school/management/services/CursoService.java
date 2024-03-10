package com.school.management.services;

import com.school.management.models.CursoModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

@Service
public class CursoService {

    public CursoModel salvar(CursoModel curso) throws Exception {
        if (validar(curso))
            return CursoModel.adicionarCurso(curso);
        return null;
    }

    private boolean validar(CursoModel curso) throws Exception {
        if (!StringUtils.hasText(curso.getNome()))
            throw new Exception("Nome é obrigatório!");
        if (curso.getCarga_horaria() == null)
            throw new Exception("Carga Horária é obrigatório!");
        return true;
    }

    public ArrayList<CursoModel> listar(){
        return CursoModel.getListaCursos();
    }
}
