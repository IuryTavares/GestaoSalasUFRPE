package br.ufrpe.bcc.controller;

import br.ufrpe.bcc.model.beans.Predio;

import java.util.ArrayList;

public interface IControladorPredio {
    void cadastrarPredio(Predio p);
    void removerPredio(Predio p);
    Predio buscarPredio(String lote);
    ArrayList<Predio> getList();
}
