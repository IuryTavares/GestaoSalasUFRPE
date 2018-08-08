package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.AlocacaoSalaGeneric;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SalasController implements Initializable {
    @FXML
    private TableColumn<AlocacaoSalaGeneric, Integer> colunaSala;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, Integer> colunaAndar;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, String> colunaTipo;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, String> colunaProfessor;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, String> colunaStatus;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, Integer> colunaHinicial;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, Integer> colunaHFim;

    @FXML
    private  TableView<AlocacaoSalaGeneric> tabela;



    private ObservableList<AlocacaoSalaGeneric> listaDeAlocacoes() {

        ArrayList<AlocacaoSalaGeneric>lista = new ArrayList<>();

        for(AlocacaoSala alocacao: Fachada.getInstance().listarSalas()){
            AlocacaoSalaGeneric alocgeneric = new AlocacaoSalaGeneric(alocacao);
            lista.add(alocgeneric);
        }

        return FXCollections.observableArrayList(lista);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colunaSala.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,Integer>("sala"));
        colunaAndar.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,Integer>("andar"));
        colunaProfessor.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,String>("professor"));
        colunaTipo.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,String>("Tipo"));
        colunaStatus.setCellValueFactory(new PropertyValueFactory<AlocacaoSalaGeneric, String>("status"));
        colunaHinicial.setCellValueFactory(new PropertyValueFactory<AlocacaoSalaGeneric, Integer>("hInicial"));
        colunaHFim.setCellValueFactory(new PropertyValueFactory<AlocacaoSalaGeneric, Integer>("hFinal"));

        tabela.setItems(listaDeAlocacoes());
    }

    public void irAlocacao(){
        Telas.getInstance().getNovaAlocacaoSala();
    }

    public void irMenu(){
        Telas.getInstance().getMenuADM();
    }

    public void irLogin(){
        Telas.getInstance().getLogin();
    }

    public void atualizarTabelaSalas(){
        tabela.getColumns().get(0).setVisible(false);
        tabela.getColumns().get(0).setVisible(true);
    }

    public TableView<AlocacaoSalaGeneric> getTabela(){
        return tabela;
    }

}
