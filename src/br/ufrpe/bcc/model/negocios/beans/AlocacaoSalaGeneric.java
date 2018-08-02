package br.ufrpe.bcc.model.negocios.beans;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;

public class AlocacaoSalaGeneric {
    private SimpleIntegerProperty sala;
    private SimpleIntegerProperty andar;
    private SimpleStringProperty Tipo;
    private SimpleStringProperty status;
    private SimpleStringProperty professor;
    private AlocacaoSala alocacaoSala;


    public AlocacaoSalaGeneric(AlocacaoSala a){
        this.alocacaoSala= a;
        this.sala = new SimpleIntegerProperty(alocacaoSala.getSala().getId());
        this.andar = new SimpleIntegerProperty(alocacaoSala.getSala().getAndar());
        this.Tipo = new SimpleStringProperty(alocacaoSala.getSala().getTipo());
        this.status = new SimpleStringProperty("Ocupada");
        this.professor = new SimpleStringProperty(alocacaoSala.getProfessor().getNome());
    }


    public int getSala() {
        return sala.get();
    }

    public SimpleIntegerProperty salaProperty() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala.set(sala);
    }

    public int getAndar() {
        return andar.get();
    }

    public SimpleIntegerProperty andarProperty() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar.set(andar);
    }

    public String getTipo() {
        return Tipo.get();
    }

    public SimpleStringProperty tipoProperty() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo.set(tipo);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getProfessor() {
        return professor.get();
    }

    public SimpleStringProperty professorProperty() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor.set(professor);
    }

    public AlocacaoSala getAlocacaoSala() {
        return alocacaoSala;
    }

    public void setAlocacaoSala(AlocacaoSala alocacaoSala) {
        this.alocacaoSala = alocacaoSala;
    }
}
