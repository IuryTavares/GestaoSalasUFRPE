package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Aluno;
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

    @Override
    public void cadastrar(Aluno a) {
        repositorio.cadastrar(a);
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
