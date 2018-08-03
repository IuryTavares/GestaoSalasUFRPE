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
    private TextField txtID;

    @FXML
    private TextField txtArea;

    @FXML
    private TextField txtAndar;

    @FXML
    private TextField txtCapacidade;

    private Fachada fachada = Fachada.getInstance();

    @FXML
    void Cadastrar() {
        int ID = this.txtID.getPrefColumnCount();
        int andar = this.txtAndar.getPrefColumnCount();
        int capacidade = this.txtCapacidade.getPrefColumnCount();
        double area = this.txtArea.getPrefColumnCount();
        String nome = this.txtNome.getText();
        String tipo = this.txtTipo.getText();

        Sala salagenerica = new Sala(nome,tipo,area,ID,andar,capacidade);

        fachada.novaSala(fachada.getPredio("12322123"), salagenerica);

        Telas.getInstance().getMenuADM();
    }

    @FXML
    void voltarMENU() {
        Telas.getInstance().getMenuADM();
    }
}
