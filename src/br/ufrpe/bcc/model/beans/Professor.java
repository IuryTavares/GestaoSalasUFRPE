package br.ufrpe.bcc.model.beans;

import java.util.Objects;

public class Professor extends PessoaFisica {
    private String matricula;
    private String departamento;

    @Override
    public String toString() {
        return "Professor{" +
                "matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(matricula, professor.matricula) &&
                Objects.equals(departamento, professor.departamento);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), matricula, departamento);
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
