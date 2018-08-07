package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroSalaController {
    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtArea;

    @FXML
    private TextField txtAndar;

    @FXML
    private TextField txtCapacidade;

    private Fachada fachada = Fachada.getInstance();

    @FXML
    void Cadastrar() {
        int andar = Integer.valueOf(txtAndar.getText());
        int capacidade = Integer.valueOf(txtCapacidade.getText());
        double area = Double.valueOf(txtArea.getText());
        String nome = this.txtNome.getText();
        String tipo = this.txtTipo.getText();

        Sala salagenerica = new Sala(nome,tipo,area,(fachada.getPredio("12322123").getNumerosSalas()+1),andar,capacidade);

        fachada.novaSala(fachada.getPredio("12322123"), salagenerica);

        Telas.getInstance().getMenuADM();
    }

    @FXML
    void voltarMENU() {
        Telas.getInstance().getMenuADM();
    }
}
