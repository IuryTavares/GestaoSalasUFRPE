package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Professor;

import java.io.Serializable;
import java.util.ArrayList;

public class RepositorioProfessor implements IRepositorioProfessor, Serializable {
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
    public boolean cadastrar(Professor p) {
        if(existe(p.getCpf())){
            return false;
        }
        repositorio.add(p);
        return true;
    }

    @Override
    public void remover(Professor p) {
        if(existe(p.getCpf())){
            repositorio.remove(p);
        }
        return;
    }

    @Override
    public boolean existe(String cpf) {
        for(Professor professor: repositorio){
            if(cpf.equals(professor.getCpf())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Professor buscar(String cpf) {
        for(Professor professor: repositorio){
            if(cpf.equals(professor.getCpf())){
                return professor;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Professor> getList() {
        return this.repositorio;
    }
}
