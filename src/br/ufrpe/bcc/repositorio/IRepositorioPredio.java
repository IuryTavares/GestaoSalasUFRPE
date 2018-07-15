package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Predio;

import java.util.ArrayList;

public interface IRepositorioPredio {
    boolean cadastrarPredio(Predio p);
    void removerPredio(Predio p);
    boolean existe(String lote);
    Predio buscarPredio(String lote);
    ArrayList<Predio> getList();
}
