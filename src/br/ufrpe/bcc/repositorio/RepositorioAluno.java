package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Aluno;

import java.io.*;
import java.util.ArrayList;

public class RepositorioAluno implements IRepositorioAluno, Serializable {
        private static IRepositorioAluno alunos;
        private ArrayList<Aluno> repositorio;

        private RepositorioAluno(){
            repositorio = new ArrayList<>();
        }

        public static synchronized IRepositorioAluno getInstance(){
            if(alunos == null){
                alunos = lerArquivo();
            }
            return alunos;
        }

        @Override
        public boolean cadastrar(Aluno p) {
            if(existe(p.getCpf())){
                return false;
            }
            repositorio.add(p);
            this.salvarArquivo();
            return true;
        }

        @Override
        public void remover(Aluno p) {
            if(existe(p.getCpf())){
                repositorio.remove(p);
                this.salvarArquivo();
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

        public static RepositorioAluno lerArquivo(){
            RepositorioAluno instance = null;
            File in = new File("Alunos.dat");
            FileInputStream fis = null;
            ObjectInputStream ois = null;

            try{
                fis = new FileInputStream(in);
                ois = new ObjectInputStream(fis);

                Object o = ois.readObject();
                instance = (RepositorioAluno) o;
            } catch (Exception e){
                instance = new RepositorioAluno();
            } finally {
                if(ois != null){
                    try{
                        ois.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
            return instance;
        }

        public void salvarArquivo(){
            File out = new File("Alunos.dat");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try{
                fos = new FileOutputStream(out);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(alunos);
            } catch(Exception e){
                e.printStackTrace();
            } finally {
                if(oos != null){
                    try{
                        oos.close();
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
}

