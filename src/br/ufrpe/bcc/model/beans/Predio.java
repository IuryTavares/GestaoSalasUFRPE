
package br.ufrpe.bcc.model.beans;

import java.util.*;

public class Predio {
    private String nome;
    private double longitude;
    private double latitude;
    private boolean ocupado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predio predio = (Predio) o;
        return Double.compare(predio.longitude, longitude) == 0 &&
                Double.compare(predio.latitude, latitude) == 0 &&
                ocupado == predio.ocupado &&
                Objects.equals(nome, predio.nome) &&
                Objects.equals(salas, predio.salas);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, longitude, latitude, ocupado, salas);
    }

    public boolean isOcupado() {

        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    private ArrayList<Sala> salas;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;

    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Predio{" +
                "nome='" + nome + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", ocupado=" + ocupado +
                ", salas=" + salas +
                '}';
    }

    public Predio(String nome, double longitude, double latitude, boolean ocupado, ArrayList<Sala> salas) {
        this.nome = nome;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ocupado = ocupado;
        this.salas = salas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

}
