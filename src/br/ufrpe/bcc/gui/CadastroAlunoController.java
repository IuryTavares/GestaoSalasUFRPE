package br.ufrpe.bcc.gui;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Aluno;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class CadastroAlunoController implements Serializable {
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtIdade;

    @FXML
    private PasswordField txtConfSenha;

    @FXML
    private PasswordField txtSenha;

    private Fachada fachada = Fachada.getInstance();

    public void Cadastrar(){
        int idade = this.txtIdade.getPrefColumnCount();
        String nome = this.txtNome.getText();
        String endereco = this.txtEndereco.getText();
        String email = this.txtEmail.getText();
        String telefone = this.txtTelefone.getText();
        String cpf = this.txtCPF.getText();
        String login = this.txtLogin.getText();
        String senha = this.txtSenha.getText();
        String confsenha = this.txtConfSenha.getText();

        try{
            if(this.txtSenha.getText().equals(this.txtConfSenha.getText())){
                Aluno aluno = new Aluno(nome,idade,endereco,email,telefone,cpf,login,senha);
                System.out.println(aluno.toString());
                if(fachada.cadastrarAluno(aluno)){
                    Telas.getInstance().getLogin();
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public void voltarLogin(){
        Telas.getInstance().getLogin();
    }
}
