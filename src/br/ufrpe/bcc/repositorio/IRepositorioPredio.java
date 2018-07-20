package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Sala;

import java.util.ArrayList;

public interface IRepositorioPredio {
    boolean cadastrarPredio(Predio p);
    void removerPredio(Predio p);
    boolean existe(String lote);
    boolean novaSala(Predio p,Sala salag);
    Predio buscarPredio(String lote);
    ArrayList<Predio> getList();
}
