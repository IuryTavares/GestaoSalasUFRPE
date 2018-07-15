package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Aluno;
import br.ufrpe.bcc.model.beans.Predio;
import br.ufrpe.bcc.model.beans.Professor;

public class Fachada {
    private static Fachada instance;

    private IControladorProfessor controladorProfessor;
    private IControladorAluno controladorAluno;
    private IControladorPredio controladorPredio;

    private Fachada(){
        controladorPredio = ControladorPredio.getInstance();
        controladorAluno = ControladorAluno.getInstance();
        controladorProfessor = ControladorProfessor.getInstance();
    }

    public static Fachada getInstance(){
        if(instance == null){
            instance = new Fachada();
        }
        return instance;
    }

    public void cadastrarAluno(Aluno a){
        this.controladorAluno.cadastrar(a);
    }

    public void cadastrarProfessor(Professor p){
        this.controladorProfessor.cadastrar(p);
    }

    public void cadastrarProfessor(Predio p){
        this.controladorPredio.cadastrarPredio(p);
    }

    public Aluno buscarAluno(Aluno a){
        return this.controladorAluno.buscar(a.getCpf());
    }

    public Professor buscarProfessor(Professor p){
        return this.controladorProfessor.buscar(p.getCpf());
    }

    public Predio buscarPredio(Predio p){
        return this.controladorPredio.buscarPredio(p.getLote());
    }


}
