package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.beans.Aluno;

import java.util.ArrayList;

public interface IControladorAluno {
    boolean cadastrar(Aluno a);
    void remover(Aluno a);
    boolean logar(String login, String senha);
    Aluno buscar(String cpf);
    ArrayList<Aluno> getList();
}
