package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Professor;

import java.util.ArrayList;

public class RepositorioProfessor implements IRepositorioProfessor{
    private static IRepositorioProfessor professores;
    private ArrayList<Professor> repositorio;

    private RepositorioProfessor(){
        repositorio = new ArrayList<>();
    }

    public static IRepositorioProfessor getInstance(){
        if(professores == null){
            professores = new RepositorioProfessor();
        }
        return professores;
    }

    @Override
    public void cadastrar(Professor p) {

    }

    @Override
    public void remover(Professor p) {

    }

    @Override
    public Professor buscar(String cpf) {
        return null;
    }

    @Override
    public ArrayList<Professor> getList() {
        return null;
    }
}
