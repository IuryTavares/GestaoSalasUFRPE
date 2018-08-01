package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.files.Salvar;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.Aluno;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;

import java.io.Serializable;
import java.util.ArrayList;

public class Fachada implements Serializable {
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
        Salvar out = new Salvar();
        boolean confirm = this.controladorAluno.cadastrar(a);
        out.salvar(this);
        return confirm;

    }

    public Aluno buscarAluno(Aluno a){
        return this.controladorAluno.buscar(a.getCpf());
    }

    public boolean logarAluno(String login, String senha){
        return this.controladorAluno.logar(login,senha);
    }


    //Professor

    public boolean cadastrarProfessor(Professor p){
        Salvar out = new Salvar();
        boolean confirm = this.controladorProfessor.cadastrar(p);
        out.salvar(this);
        return confirm;
    }

    public Professor buscarProfessor(Professor p){
        return this.controladorProfessor.buscar(p.getCpf());
    }

    public boolean logarProfessor(String login, String senha){
        return this.controladorProfessor.logar(login,senha);
    }


    //Predio

    public boolean cadastrarPredio(Predio p){
        Salvar out = new Salvar();
        boolean confirm = this.controladorPredio.cadastrarPredio(p);
        out.salvar(this);
        return confirm;

    }

    public Predio buscarPredio(Predio p){
        return this.controladorPredio.buscarPredio(p.getLote());
    }

    public boolean novaSala(Predio p, Sala salag){
        Salvar out = new Salvar();
        boolean confirm = this.controladorPredio.novaSala(p,salag);
        out.salvar(this);
        return confirm;
    }

    public int numeroSalasDisponiveis(Predio p){
        return this.controladorPredio.numeroSalasDisponiveis(p);
    }

    public int numeroSalasOcupadas(Predio p){
        return this.controladorPredio.numeroSalasOcupadas(p);
    }

    public ArrayList<Sala> getSalasPredio(Predio p){
        return this.controladorPredio.getSalasPredio(p);
    }

    public ArrayList<Predio> getList(){ return this.controladorPredio.getList(); }

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
