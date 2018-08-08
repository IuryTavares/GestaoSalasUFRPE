package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
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
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;

public class ListaSalasProfessorController implements Initializable {
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
    private TextField txtID;

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
        return FXCollections.observableArrayList(fachada.getSalasPredio(fachada.getPredio("12322123")));
    }

    @FXML
    void alocarSala() {
        int id = Integer.valueOf(txtID.getText());
        String cpf = txtCPF.getText();
        int hinicio = Integer.valueOf(intHInicio.getText());
        int hfim = Integer.valueOf(intHFim.getText());
        Date date = Date.from(data.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());

        System.out.println(date);

        AlocacaoSala alocacaoSala = new AlocacaoSala(fachada.getPredio("12322123"), fachada.getSala(id), fachada.getProfessorCPF(cpf), hinicio, hfim, date );
        try{
            if(fachada.novaAlocacao(alocacaoSala)){
                Telas.getInstance().getLogin();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void voltar() {
        Telas.getInstance().getMenuProfessor();
    }

    public void atualizarTabelaAlocacaoSala(){
        tabelaSalas.getColumns().get(0).setVisible(false);
        tabelaSalas.getColumns().get(0).setVisible(true);
    }

    public TableView<Sala> getTabela(){
        return tabelaSalas;
    }

}
