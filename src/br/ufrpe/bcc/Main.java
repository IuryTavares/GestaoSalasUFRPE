package br.ufrpe.bcc;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Aluno;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage primaryStage) throws IOException{
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/br/ufrpe/bcc/gui/Login.fxml"));
            Scene scene = new Scene(root, 640, 400);
            primaryStage.setTitle("Gestão de Salas - UFRPE");
            primaryStage.getIcons().add(new Image("/br/ufrpe/bcc/imagens/Logo-UFRPE.png"));
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Fachada fachada = Fachada.getInstance();

        Aluno a1 = new Aluno();
        a1.setLogin("a1login");
        a1.setSenha("a1senha");
        a1.setCpf("123");


        Aluno a2 = new Aluno();
        a2.setLogin("a2login");
        a2.setSenha("a2senha");
        a2.setCpf("234");


        fachada.cadastrarAluno(a1);
        fachada.cadastrarAluno(a2);


        launch(args);
    }
}
