package br.ufrpe.bcc.model.negocios.beans;

import java.io.Serializable;
import java.util.Objects;

public class PessoaFisica extends Pessoa implements Serializable {
    private String cpf;

    public PessoaFisica(String nome, int idade, String endereco, String email, String telefone, String cpf) {
        super(nome, idade, endereco, email, telefone);
        this.cpf = cpf;
    }

    public PessoaFisica() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cpf);
    }
}
