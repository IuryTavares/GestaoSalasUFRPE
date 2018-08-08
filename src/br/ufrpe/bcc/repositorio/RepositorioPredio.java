package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.controller.Fachada;
import br.ufrpe.bcc.model.negocios.beans.Predio;
import br.ufrpe.bcc.model.negocios.beans.Sala;

import java.io.*;
import java.util.ArrayList;

public class RepositorioPredio implements IRepositorioPredio, Serializable {
    private static IRepositorioPredio predios;
    private ArrayList<Predio> repositorio;

    private RepositorioPredio(){
        repositorio = new ArrayList<>();
    }

    public static synchronized IRepositorioPredio getInstance(){
        if(predios == null){
            predios = lerArquivo();
        }
        return predios;
    }


    @Override
    public boolean cadastrarPredio(Predio p) {
        if(existe(p.getLote())){
            return false;
        }
        repositorio.add(p);
        this.salvarArquivo();
        return true;
    }

    @Override
    public void removerPredio(Predio p) {
        if(existe(p.getLote())){
            repositorio.remove(p);
        }
    }

    @Override
    public boolean existe(String lote) {
        for(Predio predio: repositorio){
            if(lote.equals(predio.getLote())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Predio buscarPredio(String lote) {
        for(Predio predio: repositorio){
            if(lote.equals(predio.getLote())){
                return predio;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Predio> getList() {
        return this.repositorio;
    }

    public boolean novaSala(Predio p,Sala salag){
        for(Sala sala: p.getSalas()){
            if(salag.getId() == sala.getId()){
                return false;
            }
        }
        p.novaSala(salag);
        this.salvarArquivo();
        return true;
    }

    public int numeroSalasDisponiveis(Predio p){
        return p.numeroSalasDisponiveis();
    }

    public int numeroSalasOcupadas(Predio p){
        return p.numeroSalasOcupadas();
    }

    public ArrayList<Sala> getSalasPredio(Predio p){
        return p.getSalas();
    }

    public int getNumerosSalas(Predio p){
        return p.getNumerosSalas();
    }

    public static RepositorioPredio lerArquivo(){
        RepositorioPredio instance = null;
        File in = new File("Predios.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);

            Object o = ois.readObject();
            instance = (RepositorioPredio) o;
        } catch (Exception e){
            instance = new RepositorioPredio();
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
        File out = new File("Predios.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(predios);
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
