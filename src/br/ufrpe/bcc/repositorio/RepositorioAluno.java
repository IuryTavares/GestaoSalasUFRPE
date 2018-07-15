package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.beans.Aluno;

import java.util.ArrayList;

public class RepositorioAluno implements IRepositorioAluno{
        private static IRepositorioAluno alunos;
        private ArrayList<Aluno> repositorio;

        private RepositorioAluno(){
            repositorio = new ArrayList<>();
        }

        public static IRepositorioAluno getInstance(){
            if(alunos == null){
                alunos = new RepositorioAluno();
            }
            return alunos;
        }

        @Override
        public boolean cadastrar(Aluno p) {
            if(existe(p.getCpf())){
                return false;
            }
            repositorio.add(p);
            return true;
        }

        @Override
        public void remover(Aluno p) {
            if(existe(p.getCpf())){
                repositorio.remove(p);
            }
            return;
        }

    @Override
    public boolean existe(String cpf) {
            for(Aluno aluno: repositorio){
                if(cpf.equals(aluno.getCpf())){
                    return true;
                }
            }
        return false;
    }

    @Override
        public Aluno buscar(String cpf) {
            for(Aluno aluno: repositorio){
                if(cpf.equals(aluno.getCpf())){
                    return aluno;
                }
            }
            return null;
        }

        @Override
        public ArrayList<Aluno> getList() {
            return this.repositorio;
        }
}

