package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.Main;
import br.ufrpe.bcc.controller.Fachada;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.Serializable;

public class LoginController implements Serializable {
    @FXML PasswordField txtSenha;
    @FXML TextField txtLogin;

    private Fachada fachada = Fachada.getInstance();

    public void Login() {
        String login = this.txtLogin.getText();
        String senha = this.txtSenha.getText();
        try{
            if(txtLogin.getText().equals("admin")) {
                if (txtSenha.getText().equals("admin")) {
                    Telas.getInstance().getMenuADM();
                }
            }

            if(this.fachada.logarProfessor(login,senha)){
                Telas.getInstance().getMenuProfessor();
            }
            if(this.fachada.logarAluno(login,senha)){
                //Telas.getInstance().
            }
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void sair(){

    }
}
