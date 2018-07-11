package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Aluno;
import br.ufrpe.bcc.model.beans.Professor;

public class Fachada {
    private static Fachada instance;

    private IControladorProfessor controladorProfessor;
    //private IControladorAluno controladorAluno;
    //private IControladorPredio controladorPredio;
    private Fachada(){
        controladorProfessor = ControladorProfessor.getInstance();
    }

    public static Fachada getInstance(){
        if(instance == null){
            instance = new Fachada();
        }
        return instance;
    }

    public void cadastrar(Aluno a){
     //   this.controladorAluno.cadastrar(a);
    }

    public void cadastrar(Professor p){
        this.controladorProfessor.cadastrar(p);
    }


}
