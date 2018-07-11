package br.ufrpe.bcc.model.beans;

import java.util.Objects;

public class Sala {
    private String nome;
    private int id;
    private int capacidade;
    private String tipo; //Enum

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", capacidade=" + capacidade +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Sala(){

    }

    public Sala(String nome, int id, int capacidade, String tipo){
        this.nome = nome;
        this.id = id;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return id == sala.id &&
                capacidade == sala.capacidade &&
                Objects.equals(nome, sala.nome) &&
                Objects.equals(tipo, sala.tipo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, id, capacidade, tipo);
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
