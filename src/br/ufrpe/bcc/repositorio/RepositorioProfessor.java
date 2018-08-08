package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.beans.Professor;

import java.io.*;
import java.util.ArrayList;

public class RepositorioProfessor implements IRepositorioProfessor, Serializable {
    private static IRepositorioProfessor professores;
    private ArrayList<Professor> repositorio;

    private RepositorioProfessor(){
        repositorio = new ArrayList<>();
    }

    public static synchronized IRepositorioProfessor getInstance(){
        if(professores == null){
            professores = lerArquivo();
        }
        return professores;
    }

    @Override
    public boolean cadastrar(Professor p) {
        if(existe(p.getCpf())){
            return false;
        }
        repositorio.add(p);
        this.salvarArquivo();
        return true;
    }

    @Override
    public void remover(Professor p) {
        if(existe(p.getCpf())){
            repositorio.remove(p);
            this.salvarArquivo();
        }
        return;
    }

    @Override
    public boolean existe(String cpf) {
        for(Professor professor: repositorio){
            if(cpf.equals(professor.getCpf())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Professor buscar(String cpf) {
        for(Professor professor: repositorio){
            if(cpf.equals(professor.getCpf())){
                return professor;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Professor> getList() {
        return this.repositorio;
    }

    public static RepositorioProfessor lerArquivo(){
        RepositorioProfessor instance = null;
        File in = new File("Professores.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);

            Object o = ois.readObject();
            instance = (RepositorioProfessor) o;
        } catch (Exception e){
            instance = new RepositorioProfessor();
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
        File out = new File("Professores.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(professores);
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
