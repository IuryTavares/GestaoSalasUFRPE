package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.model.negocios.beans.Professor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfessoresController implements Initializable {

    @FXML
    private TableColumn<Professor, String> colunaMatricula;

    @FXML
    private TableColumn<Professor, String> colunaNome;

    @FXML
    private TableColumn<Professor, String> colunaDepartamento;

    @FXML
    private TableColumn<Professor, String> colunaEmail;

    @FXML
    private TableColumn<Professor, String> colunaTelefone;

    @FXML
    private TableColumn<Professor, Integer> colunaIdade;

    @FXML
    private  TableView<Professor> tabelaProfessores;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colunaMatricula.setCellValueFactory(
                new PropertyValueFactory<Professor,String>("Matricula"));
        colunaNome.setCellValueFactory(
                new PropertyValueFactory<Professor,String>("Nome"));
        colunaDepartamento.setCellValueFactory(
                new PropertyValueFactory<Professor,String>("Departamento"));
        colunaEmail.setCellValueFactory(
                new PropertyValueFactory<Professor,String>("Email"));
        colunaTelefone.setCellValueFactory(
                new PropertyValueFactory<Professor,String>("Telefone"));
        colunaIdade.setCellValueFactory(
                new PropertyValueFactory<Professor,Integer>("Idade"));

        tabelaProfessores.setItems(listaDeProfessores());
    }

    private ObservableList<Professor> listaDeProfessores() {
        return FXCollections.observableArrayList(
                new Professor("Gru",42,"Algum Lugar","gru@ufrpe.br","3212-3456","123.456.789.0","gru","minions","DC"),
                new Professor("Minha Arma",30,"Queria Saber","minha.arma@ufrpe.br","souber avisa","012.345.678-9","m16","5.56x45","DC"),
                new Professor("Nefario",40,"Quem souber morre","nefario@ufrpe.br","3000-0000","901.23456-8","nefario", "mas ve","DC")

        );
    }
}
