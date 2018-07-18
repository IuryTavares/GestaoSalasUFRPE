package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Predio;
import br.ufrpe.bcc.model.beans.Sala;
import br.ufrpe.bcc.repositorio.IRepositorioPredio;
import br.ufrpe.bcc.repositorio.RepositorioPredio;

import java.util.ArrayList;

public class ControladorPredio implements IControladorPredio {
    private static IControladorPredio controller;
    private IRepositorioPredio repositorio;

    private ControladorPredio() {
        this.repositorio = RepositorioPredio.getInstance();
    }

    public static IControladorPredio getInstance() {
        if (controller == null) {
            controller = new ControladorPredio();
        }
        return controller;
    }

    @Override
    public void cadastrarPredio(Predio p) {
        repositorio.cadastrarPredio(p);
    }

    @Override
    public void removerPredio(Predio p) {
        repositorio.removerPredio(p);
    }

    @Override
    public Predio buscarPredio(String lote) {
        return repositorio.buscarPredio(lote);
    }

    @Override
    public ArrayList<Predio> getList() {
        return this.repositorio.getList();
    }

    public boolean novaSala(Predio p, Sala salag){
        return this.repositorio.novaSala(p,salag);
    }
}
