/*
Alunos: Renato Barreto, Gabriel Olavo, Camile Oliveira
 */

package com.mycompany.lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int quest;
        int alcoolCount = 0;
        int gasolinaCount = 0;
        int dieselCount = 0;
        
        do{
            
        System.out.print("Digite o que deseja: \n");
        System.out.print("1 - Álcool\n");
        System.out.print("2 - Gasolina\n");
        System.out.print("3 - Diesel\n");
        System.out.print("4 - Fim\n");
        System.out.print("Digite: ");
        quest = scan.nextInt();
            
            switch (quest) {
                case 1:
                    alcoolCount++;
                    break;
                case 2:
                    gasolinaCount++;
                    break;
                case 3:
                    dieselCount++;
                    break;
                case 4:
                    System.out.print("Muito Obrigado \n");
                    break;
            }
        
        }while(quest != 4);
        
        System.out.print("Resultado\n");
        System.out.printf("Alcool: %d\n", alcoolCount);
        System.out.printf("Gasolina: %d\n", gasolinaCount);
        System.out.printf("Diesel: %d\n", dieselCount);
        
        }
    }