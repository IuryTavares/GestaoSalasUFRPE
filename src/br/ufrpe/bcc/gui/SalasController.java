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
    private TableColumn<AlocacaoSalaGeneric, String> colunaStatus;

    @FXML
    private TableColumn<AlocacaoSalaGeneric, String> colunaProfessor;

    @FXML
    private  TableView<AlocacaoSalaGeneric> tabela;



    private ObservableList<AlocacaoSalaGeneric> listaDeAlocacoes() {
        Predio p1 = Fachada.getInstance().getPredio("12322123");

        Sala s1 = new Sala(
                "Sala 1","Sala de aula", 3.15 , 1, 30);
        Sala s2 = new Sala(
                "Sala 2","Auditorio", 6,2,60);

        Professor pf1 = new Professor(
                "Gru",42,"Algum Lugar","gru@ufrpe.br","3212-3456","123.456.789.0","gru","minions","DC");

        AlocacaoSala as1 = new AlocacaoSala(p1,s1,pf1,14,16);
        AlocacaoSala as2 = new AlocacaoSala(p1,s2,pf1,16,18);

        AlocacaoSalaGeneric ag1= new AlocacaoSalaGeneric(as1);
        AlocacaoSalaGeneric ag2= new AlocacaoSalaGeneric(as2);

        ArrayList<AlocacaoSalaGeneric>lista = new ArrayList<>();
        lista.add(ag1);
        lista.add(ag2);

        return FXCollections.observableArrayList(
                new AlocacaoSalaGeneric(as1),
                new AlocacaoSalaGeneric(as2),
                new AlocacaoSalaGeneric(as1),
                new AlocacaoSalaGeneric(as1),
                new AlocacaoSalaGeneric(as2),
                new AlocacaoSalaGeneric(as2)
        );
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colunaSala.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,Integer>("sala"));
        colunaAndar.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,Integer>("andar"));
        colunaProfessor.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,String>("professor"));
        colunaStatus.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,String>("status"));
        colunaTipo.setCellValueFactory(
                new PropertyValueFactory<AlocacaoSalaGeneric,String>("Tipo"));

        tabela.setItems(listaDeAlocacoes());
    }

}
