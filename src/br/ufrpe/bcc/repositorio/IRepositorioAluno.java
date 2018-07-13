package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Aluno;

import java.util.ArrayList;

public interface IRepositorioAluno {
    void cadastrar(Aluno p);
    void remover(Aluno p);
    Aluno buscar(String lote);
    ArrayList<Aluno> getList();
}
