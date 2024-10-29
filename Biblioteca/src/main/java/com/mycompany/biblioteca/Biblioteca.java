/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author aluno.den
 */
import java.util.Scanner;
import entidades.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca 
{
    public static void main(String[] args) 
    {
        int quantItem,
            lacoLoop = 0,
            totalDePagina = 0;
        String titulo,
               codigo;
        
        Scanner scan = new Scanner(System.in);        
        List<ItemBiblioteca> biblioteca = new ArrayList<>();
        
        System.out.print("Informe a quantidade de itens do cadastro: ");
        quantItem = scan.nextInt();
        scan.nextLine();        
        
        while(lacoLoop < quantItem)
        {            
            System.out.println("\nLista de Item para Cadastro");
            System.out.println("1 - Livro");
            System.out.println("2 - Revista");
            System.out.print("Selecione um item: ");
            byte selecaoDeItem = scan.nextByte();
            scan.nextLine();
            
            switch (selecaoDeItem) 
            {
                case 1 -> 
                {
                    System.out.print("\nDigite o título da obra: ");
                    titulo = scan.nextLine();
                    System.out.print("Digite o código de identificação: ");
                    codigo = scan.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    String autor = scan.nextLine();
                    System.out.print("Digite a quantidade de páginas da obra: ");
                    int numeroPagina = scan.nextInt();
                    
                    // Instanciando a Class Livro e adicionando no ArrayList bibiloteca
                    
                    Livro livro = new Livro(titulo, codigo, autor, numeroPagina);                    
                    biblioteca.add(livro);
                    totalDePagina += livro.getNumeroPagina();
                    scan.nextLine();
                }
                
                case 2 -> 
                {
                    System.out.print("\nDigite o título da obra: ");
                    titulo = scan.nextLine();
                    System.out.print("Digite o código de identificação: ");
                    codigo = scan.nextLine();
                    System.out.print("Digite o mês de publicação: ");
                    String mesPublicacao = scan.nextLine();
                    System.out.print("Digite o número da edição: ");
                    short edicao = scan.nextShort();
                    
                    biblioteca.add(new Revista(titulo, codigo, mesPublicacao, edicao));
                    scan.nextLine();
                }
                
                default -> 
                {
                    // Comando Continue para retornar ao íncio do While
                    System.out.println("\nOpção inválida! Por favor, selecione um tipo item disponibilizado para cadastro");
                    continue;
                }
            }
            
            lacoLoop++;
        }  
        
        scan.close();
        
        // Laço para percorrer coleções
        
        System.out.println("\nLista de Itens Cadastrados");
        for (ItemBiblioteca bibli : biblioteca)
        {
            System.out.println(bibli.exibirDetalhes());
        } 
        
        System.out.println("\nTotal de páginas dos livros: " + totalDePagina);                                
    }
}
