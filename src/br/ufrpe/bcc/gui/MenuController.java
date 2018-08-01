package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;

public class MenuController {
    private Fachada fachada = Fachada.getInstance();

    public void irAlocacaoSala(){
        Telas.getInstance().getAlocarSala();
    }

    public void sair(){
        Telas.getInstance().getLogin();
    }

    public void irCadastroProfessor(){
        Telas.getInstance().getCadastroProfessor();
    }

    public void irCadastroPredio(){
        Telas.getInstance().getCadastroPredio();
    }
}
