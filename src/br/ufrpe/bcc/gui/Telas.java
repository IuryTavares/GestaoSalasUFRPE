package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Telas {
    FXMLLoader login, cadastroAluno, menu;
    BorderPane paneLogin;
    BorderPane border;
    BorderPane paneCadastroAluno;

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

}
