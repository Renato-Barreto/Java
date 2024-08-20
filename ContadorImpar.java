/*
Alunos: Renato Barreto, Gabriel Olavo, Camile Oliveira
 */

package com.mycompany.contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int valor;
        
        System.out.print("Digite o valor para saber os valores imapares: ");
        valor = scan.nextInt();
        
        for(int i = 0; i < valor; i++){
            
            if(i %2== 1){
                System.out.printf("%d\n",i);
            }
        }
    }
}
