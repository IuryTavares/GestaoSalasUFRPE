package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;

import java.util.ArrayList;

public interface IRepositorioAlocacao {
    boolean novaAlocacao(AlocacaoSala a);
    boolean removerAlocacao(AlocacaoSala a);
    ArrayList<AlocacaoSala> getList();
}
