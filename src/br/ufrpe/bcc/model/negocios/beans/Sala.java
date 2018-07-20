package br.ufrpe.bcc.model.negocios.beans;

import java.util.Objects;

public class Sala {
    private String nome;
    private String tipo; //Enum
    private double area;
    private int id;
    private boolean disponibilidade;

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", area=" + area +
                ", id=" + id +
                ", disponibilidade=" + disponibilidade +
                ", capacidade=" + capacidade +
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
                getCapacidade() == sala.getCapacidade() &&
                Objects.equals(getNome(), sala.getNome()) &&
                Objects.equals(getTipo(), sala.getTipo());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNome(), getTipo(), getArea(), getId(), isDisponibilidade(), getCapacidade());
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
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
