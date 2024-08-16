/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Aula {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        int quantidade;
        float preco;
        float valorPagar;
        
        
        System.out.println("Digite um código:");
        codigo=sc.nextInt();
        
        System.out.println("Digite a quantidade:");
        quantidade=sc.nextInt();
        
        if (codigo == 1){
            preco = 4.00f;
            valorPagar = preco * quantidade;
            System.out.printf("Cachorro quente = 4,00R$ \n");
            System.out.printf("%d Cachorro(s) quente(s) = %.2f",quantidade,valorPagar);
        
        } else if (codigo == 2){
            preco = 4.50f;
            valorPagar = preco * quantidade;
            System.out.printf("X-Salada = 4,50R$ \n");
            System.out.printf("%d X-Salada(s) = %.2f",quantidade,valorPagar);
        
        } else if (codigo == 3){
            preco = 5.00f;
            valorPagar = preco * quantidade;
            System.out.printf("X-Bacon = 5,00R$ \n");
            System.out.printf("%d X-Bacon(s) = %.2f",quantidade,valorPagar);
        
        } else if (codigo == 4){
            preco = 2.00f;
            valorPagar = preco * quantidade;
            System.out.printf("Torrada Simples = 2,00R$ \n");
            System.out.printf("%d Torrada(s) Simples = %.2f",quantidade,valorPagar);
        
        } else if (codigo == 5){
            preco = 1.50f;
            valorPagar = preco * quantidade;
            System.out.printf("Refrigerante = 1,50R$ \n");
            System.out.printf("%d Refrigerante(s) = %.2f",quantidade,valorPagar);
        
        }
        
        
        
    }
}
