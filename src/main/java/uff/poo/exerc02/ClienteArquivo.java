/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.poo.exerc02;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author bcipr
 */
public class ClienteArquivo implements Serializable{
    
    public ClienteArquivo(Cliente cliente){
        
    }
    
    public static void inserir (Cliente cliente){
        
        try{
            FileOutputStream f = new FileOutputStream("c:\\clientes.cli");
            ObjectOutputStream fobj = new ObjectOutputStream(f);
            ClienteArquivo reg = new ClienteArquivo(cliente);
            fobj.writeObject(reg);
            fobj.close();
            f.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException e){
            e.getMessage();
        }
        
    }
    
    public static Cliente buscarPorCPF (String cpf){
        
        Cliente reg = new Cliente();
        try{
            FileInputStream f = new FileInputStream("c:\\clientes.cli");
            ObjectInputStream fobj = new ObjectInputStream(f);
            reg = (Cliente)fobj.readObject();
            fobj.close();
            f.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }
        if (reg.getCpf().equals(cpf))
            return reg;
        else{
            System.out.println("O CPF não foi encontrado!");
            return null;
        }
    }
        
    public static ArrayList<Cliente> buscarPorNome (String nome){
        
        ArrayList<Cliente> reg = new ArrayList<>();
        ArrayList<Cliente> adj = new ArrayList<>();
        try{
            FileInputStream f = new FileInputStream("c:\\clientes.cli");
            ObjectInputStream fobj = new ObjectInputStream(f);
            for (int i = 0; i < reg.size(); i++){
                reg.add((Cliente)fobj.readObject());
            }
            fobj.close();
            f.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        catch(IOException e){
            e.getMessage();
        } 
        catch (ClassNotFoundException e) {
            e.getMessage();
        }
        for (int i = 0; i < reg.size(); i++){
            if (reg.get(i).getNome().equals(nome))
                adj.add(reg.get(i));
        }
        return adj;
    }
    
    public static ArrayList<Cliente> listar (){
        
        ArrayList<Cliente> reg = new ArrayList<>();
        ArrayList<Cliente> adj = new ArrayList<>();
        try{
            FileInputStream f = new FileInputStream("c:\\clientes.cli");
            ObjectInputStream fobj = new ObjectInputStream(f);
            for (int i = 0; i < reg.size(); i++){
                reg.add((Cliente)fobj.readObject());
            }
            fobj.close();
            f.close();
        }
        catch(IOException e){
            e.getMessage();
        } 
        catch (ClassNotFoundException e) {
            e.getMessage();
        }
        for (int i = 0; i < reg.size(); i++){
            adj.add(reg.get(i));
        }
        return adj;
    }
    
    public static void excluir (String cpf){
        
        try{
            FileInputStream f = new FileInputStream("c:\\clientes.cli");
            File a = new File("c:\\clientes.cli");
            ObjectInputStream fobj = new ObjectInputStream(f);
            Cliente reg = (Cliente)fobj.readObject();
            if (reg.getCpf().equals(cpf))
                a.delete();
            else
                System.out.println("O CPF não foi encontrado!");
            fobj.close();
            f.close();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        } 
        catch (IOException e) {
            e.getMessage();
        } 
        catch (ClassNotFoundException e) {
            e.getMessage();
        }
        
    }
    
}
