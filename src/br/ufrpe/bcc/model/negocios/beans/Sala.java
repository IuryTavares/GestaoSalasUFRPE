package br.ufrpe.bcc.model.negocios.beans;

import java.io.Serializable;
import java.util.Objects;

public class Sala implements Serializable {
    private String nome;
    private String tipo;
    private double area;
    private int id;
    private boolean ocupada;
    private int andar;

    public Sala(String nome, String tipo, double area, int id, int andar, int capacidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.area = area;
        this.id = id;
        this.andar = andar;
        this.capacidade = capacidade;
        this.ocupada = false;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", area=" + area +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return Double.compare(sala.getArea(), getArea()) == 0 &&
                getId() == sala.getId() &&
                isDisponibilidade() == sala.isDisponibilidade() &&
                getAndar() == sala.getAndar() &&
                getCapacidade() == sala.getCapacidade() &&
                Objects.equals(getNome(), sala.getNome()) &&
                Objects.equals(getTipo(), sala.getTipo());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNome(), getTipo(), getArea(), getId(), isDisponibilidade(), getAndar(), getCapacidade());
    }

    public boolean isDisponibilidade() {
        return ocupada;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.ocupada = disponibilidade;
    }

    public double getArea() {

        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private int capacidade;

    public Sala(){

    }

    public Sala(String nome, String tipo, double area, int id, int capacidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.area = area;
        this.id = id;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
