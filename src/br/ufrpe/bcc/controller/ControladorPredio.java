package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import br.ufrpe.bcc.repositorio.IRepositorioPredio;
import br.ufrpe.bcc.repositorio.RepositorioPredio;

import java.io.Serializable;
import java.util.ArrayList;

public class ControladorPredio implements IControladorPredio, Serializable {
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
    public boolean cadastrarPredio(Predio p) {
        return repositorio.cadastrarPredio(p);
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

    public int numeroSalasOcupadas(Predio p){
        return this.repositorio.numeroSalasOcupadas(p);
    }

    public int numeroSalasDisponiveis(Predio p){
        return this.repositorio.numeroSalasDisponiveis(p);
    }

    public ArrayList<Sala> getSalasPredio(Predio p){
        return this.repositorio.getSalasPredio(p);
    }
}
