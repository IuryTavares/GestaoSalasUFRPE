package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Professor;

import java.util.ArrayList;

public interface IRepositorioProfessor {
    void cadastrar(Professor p);
    void remover(Professor p);
    Professor buscar(String cpf);;
    ArrayList<Professor> getList();
}
