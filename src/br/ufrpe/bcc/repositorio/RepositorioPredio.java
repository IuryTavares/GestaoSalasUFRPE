package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Predio;

import java.util.ArrayList;

public class RepositorioPredio implements IRepositorioPredio {
    private static IRepositorioPredio predios;
    private ArrayList<Predio> repositorio;

    private RepositorioPredio(){
        repositorio = new ArrayList<>();
    }

    public static IRepositorioPredio getInstance(){
        if(predios == null){
            predios = new RepositorioPredio();
        }
        return predios;
    }


    @Override
    public void cadastrarPredio(Predio p) {

    }

    @Override
    public void removerPredio(Predio p) {

    }

    @Override
    public Predio buscarPredio(String lote) {
        return null;
    }

    @Override
    public ArrayList<Predio> getList() {
        return null;
    }
}
