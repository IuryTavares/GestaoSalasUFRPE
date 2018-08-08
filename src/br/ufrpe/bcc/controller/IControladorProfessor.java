package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.beans.Professor;

import java.util.ArrayList;

public interface IControladorProfessor {
    boolean cadastrar(Professor p);
    void remover(Professor p);
    boolean logar(String login, String cpf);
    Professor buscar(String cpf);;
    ArrayList<Professor> getList();
}
