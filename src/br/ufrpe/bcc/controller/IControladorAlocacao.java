package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;

import java.util.ArrayList;

public interface IControladorAlocacao {
    boolean novaAlocacao(AlocacaoSala a);
    boolean removerAlocacao(AlocacaoSala a);
    ArrayList<AlocacaoSala> getList();
}
