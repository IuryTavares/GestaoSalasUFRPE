package br.ufrpe.bcc.model.beans;

import java.util.Objects;

public class Professor extends PessoaFisica {
    private String login;
    private String senha;
    private String matricula = super.getCpf();
    private String departamento;

    public Professor(String nome, int idade, String endereco, String email, String telefone, String cpf, String login, String senha, String departamento) {
        super(nome, idade, endereco, email, telefone, cpf);
        this.login = login;
        this.senha = senha;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(login, professor.login) &&
                Objects.equals(senha, professor.senha) &&
                Objects.equals(matricula, professor.matricula) &&
                Objects.equals(departamento, professor.departamento);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), login, senha, matricula, departamento);
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
