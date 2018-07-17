package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Professor;

import java.util.ArrayList;

public interface IControladorProfessor {
    void cadastrar(Professor p);
    void remover(Professor p);
    boolean logar(String login, String cpf);
    Professor buscar(String cpf);;
    ArrayList<Professor> getList();
}
