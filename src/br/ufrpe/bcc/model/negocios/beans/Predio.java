
package br.ufrpe.bcc.model.negocios.beans;

import java.util.*;

public class Predio {
    private String nome;
    private String lote;
    private double longitude;
    private double latitude;
    private boolean ocupado;
    private ArrayList<Sala> salas;

    public Predio(String nome, String lote, double longitude, double latitude) {
        this.nome = nome;
        this.lote = lote;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ocupado = false;
        this.salas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Predio{" +
                "nome='" + nome + '\'' +
                ", lote='" + lote + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", ocupado=" + ocupado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predio predio = (Predio) o;
        return Double.compare(predio.getLongitude(), getLongitude()) == 0 &&
                Double.compare(predio.getLatitude(), getLatitude()) == 0 &&
                Objects.equals(getNome(), predio.getNome()) &&
                Objects.equals(getLote(), predio.getLote());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNome(), getLote(), getLongitude(), getLatitude());
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public boolean isOcupado() {

        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

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

    public ArrayList<Sala> getSalasAlocadas(){
        ArrayList<Sala> salasexit = new ArrayList<>();
        for(Sala sala: salas){
            if(sala.isDisponibilidade()){
                salasexit.add(sala);
            }
        }
        return salasexit;
    }

    public ArrayList<Sala> getSalasDisponiveis(){
        ArrayList<Sala> salasexit = new ArrayList<>();
        for(Sala sala: salas){
            if(sala.isDisponibilidade() == false){
                salasexit.add(sala);
            }
        }
        return salasexit;
    }

    public String getNumerosSalas(){
        for(Sala sala: salas){
            return sala.getNome();
        }
        return null;
    }

    public void novaSala(Sala salag){
        this.salas.add(salag);
        return;
    }

}
