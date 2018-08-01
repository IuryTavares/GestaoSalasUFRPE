package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class CadastroPredioController implements Serializable {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtLote;

    @FXML
    private TextField txtLongitude;

    @FXML
    private TextField txtLatitude;

    private Fachada fachada = Fachada.getInstance();

    @FXML
    void Cadastrar() {
        String nome = this.txtNome.getText();
        String lote = this.txtLote.getText();
        double longitude = this.txtLongitude.getPrefColumnCount();
        double latitude = this.txtLatitude.getPrefColumnCount();
        Predio p = new Predio(nome,lote,longitude,latitude);

        try{
            if(fachada.cadastrarPredio(p)){
                Telas.getInstance().getMenuADM();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void voltarMENU() {
        Telas.getInstance().getMenuADM();
    }
}
