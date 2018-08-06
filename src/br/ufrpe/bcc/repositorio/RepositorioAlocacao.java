package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;

import java.io.Serializable;
import java.util.ArrayList;

public class RepositorioAlocacao implements IRepositorioAlocacao, Serializable {
    private static IRepositorioAlocacao alocacoes;
    private ArrayList<AlocacaoSala> repositorio;

    private RepositorioAlocacao(){
        repositorio = new ArrayList<>();
    }

    public static IRepositorioAlocacao getInstance(){
        if(alocacoes == null){
            alocacoes = new RepositorioAlocacao();
        }
        return alocacoes;
    }


    @Override
    public boolean novaAlocacao(AlocacaoSala a) {
        for(AlocacaoSala alocacao: repositorio){
            if(a.getSala().equals(alocacao.getSala())){
                if(a.getHoraInicio() >= alocacao.getHoraInicio()){
                    if(a.getHoraInicio() < alocacao.getHoraFim()){
                        return false;
                    }
                }
                if(a.getHoraInicio() == alocacao.getHoraInicio()){
                    return false;
                }
            }
        }
        repositorio.add(a);
        return true;
    }

    @Override
    public boolean removerAlocacao(AlocacaoSala a) {
        for(AlocacaoSala alocacao: repositorio){
            if(a.equals(alocacao)){
                repositorio.remove(a);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<AlocacaoSala> getList() {
        return repositorio;
    }
}
