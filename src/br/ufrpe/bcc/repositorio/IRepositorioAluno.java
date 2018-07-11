package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Aluno;

import java.util.ArrayList;

public interface IRepositorioAluno {
    void cadastrar(Aluno a);
    void remover(Aluno a);
    Aluno buscar(String cpf);
    ArrayList<Aluno> getList();
}
