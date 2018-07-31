package br.ufrpe.bcc;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.gui.SalasController;
import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import br.ufrpe.bcc.model.negocios.beans.Aluno;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.text.TableView;
import java.io.IOException;

public class Main extends Application {

    private static BorderPane root = new BorderPane();

    public void start(Stage primaryStage) throws IOException{
        try{
            this.root = FXMLLoader.load(getClass().getResource("/br/ufrpe/bcc/gui/Salas.fxml"));
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

        Predio ceagri = new Predio("Ceagri-2", "12322123", 199.22,112.3);
        Professor professor1 = new Professor("ProfessorGAME", 33, "Ceagri e e nois", "profelele@gmail.com", "819123123123","12312312312", "profelele","laemksa","DEINFO");
        Sala sala1 = new Sala("Sala 1", "Sala de estudos", 40,01,40);
        fachada.novaSala(ceagri,sala1);
        AlocacaoSala alocar = new AlocacaoSala();
        alocar.setPredio(ceagri);
        alocar.setProfessor(professor1);



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

    public static BorderPane getRoot(){
        return root;
    }
}
