package com.school.management.services;

import com.school.management.models.AlunoModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

@Service
public class AlunoService {

    public AlunoModel salvar(AlunoModel aluno) throws Exception {
        if (validar(aluno))
            return AlunoModel.adicionarLista(aluno);
        return null;
    }

    private boolean validar(AlunoModel aluno) throws Exception {
        if (!StringUtils.hasText(aluno.getNome()))
            throw new Exception("Nome é obrigatório!");
        if (aluno.getData_nascimento() == null)
            throw new Exception("Data de Nascimento é obrigatório!");
        return true;
    }

    public ArrayList<AlunoModel> listar(){
        return AlunoModel.getListaAlunos();
    }

    public AlunoModel listarPorId(Integer id) throws Exception {
        return AlunoModel.buscarPorId(id);
    }

}
