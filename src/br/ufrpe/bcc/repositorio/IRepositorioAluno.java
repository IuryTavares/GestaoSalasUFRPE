package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Aluno;

import java.util.ArrayList;

public interface IRepositorioAluno {
    boolean cadastrar(Aluno p);
    void remover(Aluno p);
    boolean existe(String cpf);
    Aluno buscar(String cpf);
    ArrayList<Aluno> getList();
}
