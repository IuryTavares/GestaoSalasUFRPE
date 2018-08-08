package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Professor;

import java.util.ArrayList;

public interface IRepositorioProfessor {
    boolean cadastrar(Professor p);
    void remover(Professor p);
    boolean existe(String cpf);
    Professor buscar(String cpf);
    ArrayList<Professor> getList();
}
