package br.ufrpe.bcc.controller;

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

    public Professor getProfessorCPF(String cpf){ return this.controladorProfessor.buscar(cpf); }

    public boolean logarProfessor(String login, String senha){
        return this.controladorProfessor.logar(login,senha);
    }

    public ArrayList<Professor> getListProfessor(){
        return this.controladorProfessor.getList();
    }

    public void removerProfessor(Professor p){
        this.controladorProfessor.remover(p);
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

    public Predio getPredio(String lote){
        for(Predio predio: this.controladorPredio.getList()){
            if(lote.equals(predio.getLote())){
                return predio;
            }
        }
        return null;
    }

    public Sala getSala(int id){
        return Fachada.getInstance().getPredio("12322123").getSala(id);
    }

    //Alocacao

    public boolean novaAlocacao(AlocacaoSala a){
        return this.controladorAlocacao.novaAlocacao(a);
    }

    public boolean removerAlocacao(AlocacaoSala a){
        return this.controladorAlocacao.removerAlocacao(a);
    }

    public ArrayList<AlocacaoSala> listarSalas(){
        return this.controladorAlocacao.getList();
    }



}
