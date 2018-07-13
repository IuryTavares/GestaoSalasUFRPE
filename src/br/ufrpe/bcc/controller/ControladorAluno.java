package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Aluno;
import br.ufrpe.bcc.repositorio.IRepositorioAluno;

import java.util.ArrayList;

public class ControladorAluno implements IControladorAluno{
    private static IControladorAluno controller;
    private IRepositorioAluno repositorio;

    @Override
    public void cadastrar(Aluno a) {

    }

    @Override
    public void remover(Aluno a) {

    }

    @Override
    public Aluno buscar(String cpf) {
        return null;
    }

    @Override
    public ArrayList<Aluno> getList() {
        return null;
    }
}
