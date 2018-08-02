package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.Serializable;

public class TabelaPrediosController implements Serializable {
    @FXML
    private TableView<Predio> tabelaPredio;

    @FXML
    private TableColumn<Predio, String> colunaPredio;

    @FXML
    private TableColumn<Predio, Integer> colunaSalasDisponiveis;

    @FXML
    private TableColumn<Predio, Integer> colunaSalasOcupadas;

    private Fachada fachada = Fachada.getInstance();

    public void showInfo(){
        /*colunaPredio.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaSalasDisponiveis.setCellValueFactory(new PropertyValueFactory<Predio, Integer>("salasDisponiveis"));
        colunaSalasOcupadas.setCellValueFactory(new PropertyValueFactory<Predio, Integer>("salasOcupadas"));

        tabelaPredio.setItems(FXCollections.observableList(Fachada.getInstance().getList()));
        tabelaPredio.refresh();
        */
    }
}
