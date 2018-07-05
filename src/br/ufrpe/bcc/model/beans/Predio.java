package br.ufrpe.bcc.model.beans;

import java.util.Collection;
import java.util.Objects;

public class Predio {
    private String nome;
    private Collection<Sala> salas;

    @Override
    public String toString() {
        return "Predio{" +
                "nome='" + nome + '\'' +
                ", salas=" + salas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predio predio = (Predio) o;
        return Objects.equals(nome, predio.nome) &&
                Objects.equals(salas, predio.salas);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, salas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Sala> getSalas() {
        return salas;
    }

    public void setSalas(Collection<Sala> salas) {
        this.salas = salas;
    }
}
