/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apps;

import entidades.EstoqueClass;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Apps {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        EstoqueClass estoque;        
        int num,
            quantia;
        
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();
        
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();
        
        estoque = new EstoqueClass(nome, preco, quantidade);
        System.out.print(estoque);
        
        System.out.print("Deseja adicionar ou retirar um produto?   1-Adicionar 2-Retirar");
        num = sc.nextInt();
        
        if(num == 1){
            System.out.print("Quantidade a ser adicionada: ");
            quantia = sc.nextInt();
            estoque.AddProduto(quantia);
            System.out.print(estoque);
        }else{
            System.out.print("Quantidade a ser retirada: ");
            quantia = sc.nextInt();
            estoque.RemoverProduto(quantia);
            System.out.print(estoque);
        }
        
    }
}
