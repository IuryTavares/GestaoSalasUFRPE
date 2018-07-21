package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginController {
    @FXML PasswordField txtSenha;
    @FXML TextField txtLogin;

    private Fachada fachada = Fachada.getInstance();

    public void Login() {
        String login = this.txtLogin.getText();
        String senha = this.txtSenha.getText();
        try{
            System.out.println(this.fachada.logarAluno(login,senha));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void irCadastro(){
        Telas.getInstance().getCadastroAluno();
    }
}
