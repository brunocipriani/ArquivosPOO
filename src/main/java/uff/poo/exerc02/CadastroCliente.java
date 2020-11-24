/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.poo.exerc02;

import java.util.ArrayList;

/**
 *
 * @author bcipr
 */
public class CadastroCliente {
    
    private final ArrayList<Cliente> clientes = new ArrayList<>(10);
    
    public void inserir(Cliente cliente){
        ClienteArquivo.inserir(cliente);
    }
    
    public Cliente buscarPorCpf(String cpf){
        return ClienteArquivo.buscarPorCPF(cpf);
    }
    
    public ArrayList<Cliente> buscarPorNome(String nome){
        return ClienteArquivo.buscarPorNome(nome);
    }
    
    public ArrayList<Cliente> listar (){
        return ClienteArquivo.listar();
    }
    
    public void excluir (String cpf){
        ClienteArquivo.excluir(cpf);
    }
    
    public int numeroDeEspacosArray (){
        int aux = 0;
        for (int i = 0; i < clientes.size(); i++){
            if(clientes.get(i) != null)
                aux += 1;
        }
        return aux;
    }
}