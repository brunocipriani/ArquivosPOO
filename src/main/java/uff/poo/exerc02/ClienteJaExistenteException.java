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
public class ClienteJaExistenteException extends RuntimeException{
    ClienteJaExistenteException(){
        System.out.println("Este cliente já está cadastrado.");
    }
}
