package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.AlocacaoSalaGeneric;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaSalasController implements Initializable {
    @FXML
    private TableView<Sala> tabelaSalas;

    @FXML
    private TableColumn<Sala, Integer> colunaID;

    @FXML
    private TableColumn<Sala, String> colunaNome;

    @FXML
    private TableColumn<Sala, Integer> colunaAndar;

    @FXML
    private TableColumn<Sala, String> colunaTipo;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField intHInicio;

    @FXML
    private TextField intHFim;

    @FXML
    private DatePicker data;

    private Fachada fachada = Fachada.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colunaID.setCellValueFactory(new PropertyValueFactory<Sala, Integer>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<Sala, String>("nome"));
        colunaAndar.setCellValueFactory(new PropertyValueFactory<Sala, Integer>("andar"));
        colunaTipo.setCellValueFactory(new PropertyValueFactory<Sala, String>("tipo"));


        tabelaSalas.setItems(listaSalas());
        tabelaSalas.refresh();
    }

    private ObservableList<Sala> listaSalas() {
        System.out.println("salas" + fachada.getSalasPredio(fachada.getPredio("12322123")));
        return FXCollections.observableArrayList(fachada.getSalasPredio(fachada.getPredio("12322123")));
    }

    @FXML
    void alocarSala() {
       // AlocacaoSala alocacaoSala = new AlocacaoSala(fachada.getPredio("12322123"), )

    }

    @FXML
    void voltar() {
        Telas.getInstance().getMenuADM();
    }

}
