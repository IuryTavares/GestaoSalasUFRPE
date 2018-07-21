package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.beans.Aluno;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;

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

    //Aluno

    public boolean cadastrarAluno(Aluno a){
        return this.controladorAluno.cadastrar(a);
    }

    public Aluno buscarAluno(Aluno a){
        return this.controladorAluno.buscar(a.getCpf());
    }

    public boolean logarAluno(String login, String senha){
        return this.controladorAluno.logar(login,senha);
    }


    //Professor

    public void cadastrarProfessor(Professor p){
        this.controladorProfessor.cadastrar(p);
    }

    public Professor buscarProfessor(Professor p){
        return this.controladorProfessor.buscar(p.getCpf());
    }

    public boolean logarProfessor(String login, String senha){
        return this.controladorProfessor.logar(login,senha);
    }


    //Predio

    public void cadastrarPredio(Predio p){
        this.controladorPredio.cadastrarPredio(p);
    }

    public Predio buscarPredio(Predio p){
        return this.controladorPredio.buscarPredio(p.getLote());
    }

    public boolean novaSala(Predio p, Sala salag){
        return this.controladorPredio.novaSala(p,salag);
    }


}
