package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class CadastroProfessorController implements Serializable {
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private PasswordField txtConfSenha;

    @FXML
    private TextField txtDepartamento;

    private Fachada fachada = Fachada.getInstance();

    @FXML
    void Cadastrar() {
        int idade = Integer.valueOf(txtIdade.getText());
        String nome = this.txtNome.getText();
        String endereco = this.txtEndereco.getText();
        String email = this.txtEmail.getText();
        String telefone = this.txtTelefone.getText();
        String cpf = this.txtCPF.getText();
        String departamento = this.txtDepartamento.getText();
        String login = this.txtLogin.getText();
        String senha = this.txtSenha.getText();
        String confsenha = this.txtConfSenha.getText();

        try{
            if(this.txtSenha.getText().equals(this.txtConfSenha.getText())){
                Professor professor = new Professor(nome,idade,endereco,email,telefone,cpf,login,senha,departamento);
                if(fachada.cadastrarProfessor(professor)){
                    Telas.getInstance().getMenuADM();
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void voltarMENU() {
        Telas.getInstance().getMenuADM();
    }
}
