package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
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
        System.out.println(colunaMatricula);
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
        tabelaProfessores.refresh();
    }

    private ObservableList<Professor> listaDeProfessores() {
        System.out.println(Fachada.getInstance().getListProfessor());
        return FXCollections.observableArrayList(Fachada.getInstance().getListProfessor());
    }

    public void voltar(){
        Telas.getInstance().getMenuADM();
    }
}
