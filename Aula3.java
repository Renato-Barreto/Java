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
        
        float salario;
        float valorImposto;
        float taxa;

        
        
        System.out.println("Digite o seu salário:");
        salario = sc.nextFloat();
        
        
        if (salario >= 0 && salario <= 2000){
            valorImposto = 0;
            System.out.printf("Valor a pagar = %.0f",valorImposto);
        
        } else if (salario >= 2001 && salario <= 3000){
            valorImposto = 0.08f;
            taxa = (salario - 2000)* valorImposto;
            System.out.printf("Valor a pagar = %.0f",taxa);
        
        } else if (salario >= 3001 && salario <= 4500){
            valorImposto = 0.18f;
            taxa = (salario - 3000)* valorImposto;
            System.out.printf("Valor a pagar = %.0f",taxa);
        
        } else if (salario > 4500){
            valorImposto = 0.28f;
            taxa = (salario - 4500)* valorImposto;
            System.out.printf("Valor a pagar = %.0f",taxa);
        
        }
    }
}
