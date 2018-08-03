package br.ufrpe.bcc.files;

import br.ufrpe.bcc.controller.Fachada;

import java.io.*;

public class Salvar{


    public void salvar(Fachada fachada){
        String fileName = "arquivos.dat";
        FileOutputStream arq = null;
        try {
            arq = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(arq);
            out.writeObject(fachada);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public Fachada carregar(){
        String fileName = "arquivos.dat";
        FileInputStream arq = null;
        try {
            arq = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(arq);
            Fachada fachada = (Fachada) in.readObject();
            in.close();
            return fachada;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
