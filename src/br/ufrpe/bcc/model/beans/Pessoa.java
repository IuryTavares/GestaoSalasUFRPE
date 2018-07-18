package br.ufrpe.bcc.model.beans;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String email;
    private String telefone;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String endereco, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(endereco, pessoa.endereco) &&
                Objects.equals(email, pessoa.email) &&
                Objects.equals(telefone, pessoa.telefone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, idade, endereco, email, telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
