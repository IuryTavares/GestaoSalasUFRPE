package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SalasController {
    @FXML
    private TableColumn<AlocacaoSala, Integer> colunaSala;

    @FXML
    private TableColumn<AlocacaoSala, Integer> colunaAndar;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaTipo;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaStatus;

    @FXML
    private TableColumn<AlocacaoSala, String> colunaProfessor;

    public void showInfo(AlocacaoSala a){
        TableView tabela = new TableView<>();
        //colunaSala.setCellValueFactory(new PropertyValueFactory<>(AlocacaoSala.getSala().getId()));
        //colunaAndar.setCellValueFactory(new PropertyValueFactory<>(AlocacaoSala.getPredio().getSalas()));

    }

}
