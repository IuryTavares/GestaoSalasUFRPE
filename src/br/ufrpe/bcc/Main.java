package br.ufrpe.bcc;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Date;

public class Main extends Application {

    private static BorderPane root = new BorderPane();


    public void start(Stage primaryStage) throws IOException{
        try{
            this.root = FXMLLoader.load(getClass().getResource("/br/ufrpe/bcc/gui/Login.fxml"));
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
        launch(Main.class);
    }

    public static BorderPane getRoot(){
        return root;
    }
}
