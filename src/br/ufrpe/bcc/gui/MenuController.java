package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;

import java.io.Serializable;

public class MenuController implements Serializable {
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

    public void irCadastroSala() { Telas.getInstance().getCadastroSala(); }

    public void irListaProfessores() { Telas.getInstance().getListaProfessores(); }
}
