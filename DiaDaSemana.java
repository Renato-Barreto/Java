/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//Feito por Renato Barreto

package com.mycompany.diadasemana;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int dia;
        
        System.out.print("Digite um número de 1 a 7 para um dia da semana: ");
        dia = scan.nextInt();
        
        switch (dia) {
            case 1 -> System.out.println("Hoje é: Domigo");
            case 2 -> System.out.println("Hoje é: Segunda-feira");
            case 3 -> System.out.println("Hoje é: Terça-feira");
            case 4 -> System.out.println("Hoje é: Quarta-feira");
            case 5 -> System.out.println("Hoje é: Quinta-feira");
            case 6 -> System.out.println("Hoje é: Sexta-feira");
            case 7 -> System.out.println("Hoje é: Sábado");
            default -> System.out.println("Inválido.");
        }
    }
}