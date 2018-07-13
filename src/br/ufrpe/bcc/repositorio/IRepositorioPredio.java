package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Predio;

import java.util.ArrayList;

public interface IRepositorioPredio {
    void cadastrarPredio(Predio p);
    void removerPredio(Predio p);
    Predio buscarPredio(String lote);
    ArrayList<Predio> getList();
}
