package br.ufrpe.bcc.model.negocios.beans;

import java.io.Serializable;
import java.util.Objects;

public class Aluno extends  PessoaFisica implements Serializable {
    private String login;
    private String senha;
    private String matricula = super.getCpf();

    public Aluno(String nome, int idade, String endereco, String email, String telefone, String cpf, String login, String senha) {
        super(nome, idade, endereco, email, telefone, cpf);
        this.login = login;
        this.senha = senha;
    }

    public Aluno() {
        super();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(login, aluno.login) &&
                Objects.equals(senha, aluno.senha) &&
                Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), login, senha, matricula);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
