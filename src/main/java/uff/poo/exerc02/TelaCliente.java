/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.poo.exerc02;

import java.util.Scanner;

/**
 *
 * @author bcipr
 */
public class TelaCliente {
    
    public static void criaMenu(){
        
        System.out.println("1 - Cadastrar novo cliente");
        System.out.println("2 - Buscar cliente pelo nome");
        System.out.println("3 - Buscar cliente pelo CPF");
        System.out.println("4 - Excluir cliente");
        System.out.println("5 - Listar cliente"); 
        }
    
    public static void main (String[] args){
        
        Cliente cliente = new Cliente("Bruno", "123.456.789-01");
        CadastroCliente cadastro = new CadastroCliente();
        System.out.println("O que deseja fazer? ");
        TelaCliente.criaMenu();
        Scanner teclado = new Scanner(System.in);
        int decisao = teclado.nextInt();
        if (decisao == 1){
            cadastro.inserir(cliente);
            System.out.println("Cliente cadastrado com sucesso");
        }
        if (decisao == 2){
            System.out.println("Nome do cliente a ser buscado: ");
            Scanner teclado2 = new Scanner(System.in);
            cadastro.buscarPorNome(teclado2.next());
        }
        if (decisao == 3){
            System.out.println("CPF do cliente a ser buscado: ");
            Scanner teclado2 = new Scanner(System.in);
            cadastro.buscarPorNome(teclado2.next());
        }
        if (decisao == 4){
            System.out.println("CPF do cliente a ser excluído: ");
            Scanner teclado2 = new Scanner(System.in);
            cadastro.excluir(teclado2.next());
        }
        if (decisao == 5){
            cadastro.listar();
        }
        
    }
}
