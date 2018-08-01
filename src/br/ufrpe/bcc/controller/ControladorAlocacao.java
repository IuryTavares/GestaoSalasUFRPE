package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.repositorio.IRepositorioAlocacao;
import br.ufrpe.bcc.repositorio.RepositorioAlocacao;

import java.io.Serializable;
import java.util.ArrayList;

public class ControladorAlocacao implements IControladorAlocacao, Serializable {
    private static IControladorAlocacao controller;
    private IRepositorioAlocacao repositorio;

    private ControladorAlocacao() {
        this.repositorio = RepositorioAlocacao.getInstance();
    }

    public static IControladorAlocacao getInstance() {
        if (controller == null) {
            controller = new ControladorAlocacao();
        }
        return controller;
    }

    @Override
    public boolean novaAlocacao(AlocacaoSala a) {
        return repositorio.novaAlocacao(a);
    }

    @Override
    public boolean removerAlocacao(AlocacaoSala a) {
        return repositorio.novaAlocacao(a);
    }

    @Override
    public ArrayList<AlocacaoSala> getList() {
        return repositorio.getList();
    }
}
