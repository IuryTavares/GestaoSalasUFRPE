package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.io.Serializable;

public class Telas implements Serializable {
    FXMLLoader login, cadastroAluno, menuADM, alocarSala, cadastroProfessor, cadastroPredio, listaProfessores, cadastroSala,
            alocacaoSala;
    BorderPane paneLogin;
    BorderPane border;
    BorderPane paneCadastroAluno;
    BorderPane paneMenuADM;
    BorderPane paneAlocacaoSalas;
    BorderPane paneCadastroProfessor;
    BorderPane paneCadastroPredio;
    BorderPane paneListaProfessores;
    BorderPane paneCadastroSala;
    BorderPane paneAlocacaoSala;

    public static Telas instancia;

    public static synchronized Telas getInstance(){
        if(instancia == null){
            instancia = new Telas();
        }
        return instancia;
    }

    private Telas(){
        try{
            login = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/Login.fxml"));
            this.paneLogin = login.load();
            cadastroAluno = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/CadastroAluno.fxml"));
            this.paneCadastroAluno = cadastroAluno.load();
            menuADM = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/Menu.fxml"));
            this.paneMenuADM = menuADM.load();
            alocarSala = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/Salas.fxml"));
            this.paneAlocacaoSalas = alocarSala.load();
            cadastroProfessor = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/CadastroProfessor.fxml"));
            this.paneCadastroProfessor = cadastroProfessor.load();
            cadastroPredio = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/CadastroPredio.fxml"));
            this.paneCadastroPredio = cadastroPredio.load();
            listaProfessores = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/Professores.fxml"));
            this.paneListaProfessores = listaProfessores.load();
            cadastroSala = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/CadastroSala.fxml"));
            this.paneCadastroSala = cadastroSala.load();
            alocacaoSala = new FXMLLoader(this.getClass().getResource("/br/ufrpe/bcc/gui/ListaSalas.fxml"));
            this.paneAlocacaoSala = alocacaoSala.load();
            this.border = Main.getRoot();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void getLogin(){
        border.setCenter(this.paneLogin);
    }

    public void getCadastroAluno(){
        border.setCenter(this.paneCadastroAluno);
    }

    public void getMenuADM(){ border.setCenter(this.paneMenuADM);}

    public void getAlocarSala(){
        border.setCenter(this.paneAlocacaoSalas);
    }

    public void getCadastroProfessor(){
        border.setCenter(this.paneCadastroProfessor);
    }

    public void getCadastroPredio(){
        border.setCenter(this.paneCadastroPredio);
    }

    public void getListaProfessores(){
        border.setCenter(this.paneListaProfessores);
    }

    public void getCadastroSala() { border.setCenter(this.paneCadastroSala); }

    public void getNovaAlocacaoSala(){
        border.setCenter(this.paneAlocacaoSala);
    }

}
