package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.beans.Aluno;
import br.ufrpe.bcc.repositorio.IRepositorioAluno;
import br.ufrpe.bcc.repositorio.RepositorioAluno;

import java.util.ArrayList;

public class ControladorAluno implements IControladorAluno{
    private static IControladorAluno controller;
    private IRepositorioAluno repositorio;

    private ControladorAluno() {
        this.repositorio = RepositorioAluno.getInstance();
    }

    public static IControladorAluno getInstance() {
        if (controller == null) {
            controller = new ControladorAluno();
        }
        return controller;
    }
    public boolean logar(String login, String senha){
        for(Aluno aluno: repositorio.getList()){
            if(login.equals(aluno.getLogin())){
                if(senha.equals(aluno.getSenha())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean cadastrar(Aluno a) {
        return repositorio.cadastrar(a);
    }

    @Override
    public void remover(Aluno a) {
        repositorio.remover(a);
    }

    @Override
    public Aluno buscar(String cpf) {
        return repositorio.buscar(cpf);
    }

    @Override
    public ArrayList<Aluno> getList() {
        return repositorio.getList();
    }
}
