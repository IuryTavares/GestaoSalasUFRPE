package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.Aluno;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;

import java.util.ArrayList;

public class Fachada {
    private static Fachada instance;
    private IControladorProfessor controladorProfessor;
    private IControladorAluno controladorAluno;
    private IControladorPredio controladorPredio;
    private IControladorAlocacao controladorAlocacao;

    private Fachada(){
        controladorPredio = ControladorPredio.getInstance();
        controladorAluno = ControladorAluno.getInstance();
        controladorProfessor = ControladorProfessor.getInstance();
        controladorAlocacao = ControladorAlocacao.getInstance();
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

    public boolean cadastrarProfessor(Professor p){
        return this.controladorProfessor.cadastrar(p);
    }

    public Professor buscarProfessor(Professor p){
        return this.controladorProfessor.buscar(p.getCpf());
    }

    public boolean logarProfessor(String login, String senha){
        return this.controladorProfessor.logar(login,senha);
    }


    //Predio

    public boolean cadastrarPredio(Predio p){
        return this.controladorPredio.cadastrarPredio(p);
    }

    public Predio buscarPredio(Predio p){
        return this.controladorPredio.buscarPredio(p.getLote());
    }

    public boolean novaSala(Predio p, Sala salag){
        return this.controladorPredio.novaSala(p,salag);
    }

    public ArrayList<Sala> getSalasDisponiveis(Predio p){
        return this.controladorPredio.getSalasDisponiveis(p);
    }

    public ArrayList<Sala> getSalasOcupadas(Predio p){
        return this.controladorPredio.getSalasAlocadas(p);
    }

    public ArrayList<Sala> getSalasPredio(Predio p){
        return this.controladorPredio.getSalasPredio(p);
    }

    //Alocacao

    public boolean novaAlocacao(AlocacaoSala a){
        return this.controladorAlocacao.novaAlocacao(a);
    }

    public boolean removerAlocacao(AlocacaoSala a){
        return this.controladorAlocacao.removerAlocacao(a);
    }

    public ArrayList<AlocacaoSala> listar(){
        return this.controladorAlocacao.getList();
    }



}
