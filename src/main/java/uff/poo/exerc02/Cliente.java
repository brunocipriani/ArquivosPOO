/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.poo.exerc02;
import java.io.*;

/**
 *
 * @author bcipr
 */
public class Cliente {

    private String nome;
    private String cpf;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        try{
            if (nome.getClass().equals(String.class))
                this.nome = nome;
            else
                throw new DadoInvalidoException();
        }
        catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        try{
            if (nome.getClass().equals(String.class))
                this.cpf = cpf;
            else
                throw new DadoInvalidoException();
        }
        catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
