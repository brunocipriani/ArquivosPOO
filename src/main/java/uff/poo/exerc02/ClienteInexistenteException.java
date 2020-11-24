/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.poo.exerc02;

/**
 *
 * @author bcipr
 */
public class ClienteInexistenteException extends RuntimeException{
    public ClienteInexistenteException(){
        System.out.println("Cliente não está cadastrado.");
    }
}
