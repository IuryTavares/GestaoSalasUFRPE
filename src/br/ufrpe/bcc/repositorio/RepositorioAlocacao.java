package br.ufrpe.bcc.repositorio;

import br.ufrpe.bcc.model.negocios.AlocacaoSala;

import java.io.*;
import java.util.ArrayList;

public class RepositorioAlocacao implements IRepositorioAlocacao, Serializable {
    private static IRepositorioAlocacao alocacoes;
    private ArrayList<AlocacaoSala> repositorio;

    private RepositorioAlocacao(){
        repositorio = new ArrayList<>();
    }

    public static synchronized IRepositorioAlocacao getInstance(){
        if(alocacoes == null){
            alocacoes = lerArquivo();
        }
        return alocacoes;
    }


    @Override
    public boolean novaAlocacao(AlocacaoSala a) {
        for(AlocacaoSala alocacao: repositorio){
            if(a.getSala().equals(alocacao.getSala())){
                if(a.getData().equals(alocacao.getData())){
                    if(a.getHoraInicio() >= alocacao.getHoraInicio()){
                        if(a.getHoraInicio() < alocacao.getHoraFim()){
                            return false;
                        }
                    }
                }
                if(a.getHoraInicio() == alocacao.getHoraInicio()){
                    return false;
                }
            }
        }
        repositorio.add(a);
        this.salvarArquivo();
        return true;
    }

    @Override
    public boolean removerAlocacao(AlocacaoSala a) {
        for(AlocacaoSala alocacao: repositorio){
            if(a.equals(alocacao)){
                this.salvarArquivo();
                repositorio.remove(a);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<AlocacaoSala> getList() {
        return repositorio;
    }

    public static RepositorioAlocacao lerArquivo(){
        RepositorioAlocacao instance = null;
        File in = new File("Alocacoes.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);

            Object o = ois.readObject();
            instance = (RepositorioAlocacao) o;
        } catch (Exception e){
            instance = new RepositorioAlocacao();
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
        File out = new File("Alocacoes.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(alocacoes);
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
