package br.ufrpe.bcc.model.negocios;

import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Professor;
import br.ufrpe.bcc.model.negocios.beans.Sala;

import java.io.Serializable;
import java.util.Date;

public class AlocacaoSala implements Serializable {
    private Predio predio;
    private Sala sala;
    private Professor professor;
    private Date data;
    private int horaInicio;
    private int horaFim;

    public AlocacaoSala(Predio predio, Sala sala, Professor professor, int horaInicio, int horaFim) {
        this.predio = predio;
        this.sala = sala;
        this.professor = professor;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.data = new Date();
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }


}
