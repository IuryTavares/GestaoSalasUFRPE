package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Sala;

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
    public boolean cadastrarPredio(Predio p) {
        if(existe(p.getLote())){
            return false;
        }
        repositorio.add(p);
        return true;
    }

    @Override
    public void removerPredio(Predio p) {
        if(existe(p.getLote())){
            repositorio.remove(p);
        }
    }

    @Override
    public boolean existe(String lote) {
        for(Predio predio: repositorio){
            if(lote.equals(predio.getLote())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Predio buscarPredio(String lote) {
        for(Predio predio: repositorio){
            if(lote.equals(predio.getLote())){
                return predio;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Predio> getList() {
        return this.repositorio;
    }

    public boolean novaSala(Predio p,Sala salag){
        for(Sala sala: p.getSalas()){
            if(salag.getId() == sala.getId()){
                return false;
            }
        }
        p.getSalas().add(salag);
        return true;
    }

    public ArrayList<Sala> getSalasDisponiveis(Predio p){
        return p.getSalasDisponiveis();
    }

    public ArrayList<Sala> getSalasOcupadas(Predio p){
        return p.getSalasAlocadas();
    }

    public ArrayList<Sala> getSalasPredio(Predio p){
        return p.getSalas();
    }

    public String getNumerosSalas(Predio p){
        return p.getNumerosSalas();
    }
}
