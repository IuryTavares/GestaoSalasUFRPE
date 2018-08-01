package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.util.ArrayList;

public class SalasController {
    private Fachada fachada = Fachada.getInstance();
    @FXML
    private TableView<AlocacaoSala> tabela;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaSala;

    @FXML
    private TableColumn<AlocacaoSala, Integer> colunaAndar;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaTipo;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaStatus;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaProfessor;


    public void showInfo(){
        /*colunaSala.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaAndar.setCellValueFactory(new PropertyValueFactory<>("andar"));
        colunaProfessor.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaStatus.setCellValueFactory(new PropertyValueFactory<>("ocupada"));

        tabela.setItems(FXCollections.observableList(Fachada.getInstance().listar()));
        tabela.refresh();
        */
    }

}
