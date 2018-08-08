package br.ufrpe.bcc.gui;

import javafx.fxml.FXML;

public class MenuProfessorController {

    @FXML
    void irAlocacaoSala() {
        Telas.getInstance().getNovaAlocacaoSala();;
    }

    @FXML
    void irSalasAlocadas() {
        Telas.getInstance().getAlocarSala();
    }

    @FXML
    void sair() {
        Telas.getInstance().getLogin();
    }
}
