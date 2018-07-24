package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Sala;

import java.util.ArrayList;

public interface IControladorPredio {
    void cadastrarPredio(Predio p);
    void removerPredio(Predio p);
    public boolean novaSala(Predio p, Sala salag);
    Predio buscarPredio(String lote);
    ArrayList<Predio> getList();
    ArrayList<Sala> getSalasPredio(Predio p);
    ArrayList<Sala> getSalasDisponiveis(Predio p);
    ArrayList<Sala> getSalasAlocadas(Predio p);
}
