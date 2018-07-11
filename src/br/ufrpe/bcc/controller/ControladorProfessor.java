package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Professor;
import br.ufrpe.bcc.repositorio.IRepositorioProfessor;

import java.util.ArrayList;

public class ControladorProfessor implements IControladorProfessor{

    private static IControladorProfessor controller;
    private IRepositorioProfessor repositorio;

    private ControladorProfessor() {

    }

    public static IControladorProfessor getInstance() {
        if (controller == null) {
            controller = new ControladorProfessor();
        }
        return controller;
    }

    @Override
    public void cadastrar(Professor p) {

    }

    @Override
    public void remover(Professor p) {

    }

    @Override
    public Professor buscar(String cpf) {
        return null;
    }

    @Override
    public ArrayList<Professor> getList() {
        return null;
    }
}
