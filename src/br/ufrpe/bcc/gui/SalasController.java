package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.util.ArrayList;

public class SalasController {
    @FXML
    private TableView tabela;

    @FXML
    private TableColumn<AlocacaoSala, ArrayList<String>> colunaSala;

    @FXML
    private TableColumn<AlocacaoSala, Integer> colunaAndar;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaTipo;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaStatus;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaProfessor;

    public void showInfo(AlocacaoSala a){
        // Eu não consegui preencher a coluna;
    }

}
