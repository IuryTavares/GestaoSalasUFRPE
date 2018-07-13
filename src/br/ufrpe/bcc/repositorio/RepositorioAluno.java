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
        public void cadastrar(Aluno p) {

        }

        @Override
        public void remover(Aluno p) {

        }

        @Override
        public Aluno buscar(String cpf) {
            return null;
        }

        @Override
        public ArrayList<Aluno> getList() {
            return null;
        }
}

