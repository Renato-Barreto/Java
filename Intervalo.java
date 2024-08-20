/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalo;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Intervalo {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int valor;
        int answer;
        int in = 0;
        int out = 0;
        
        System.out.print("Digite o valor de repeticao: ");
        valor = scan.nextInt();
        
        for(int i = 0; i < valor; i++){
            
        System.out.printf("vez, Digite o valor: ");
        answer = scan.nextInt();
            
            if(answer >= 10 && answer <= 20){
                    System.out.printf("%d : in\n",answer);
                    in++;
                } else {
                    System.out.printf("%d : out\n",answer);
                    out++;
            }
        }
    
        System.out.printf("\n%d in\n",in);
        System.out.printf("%d out",out);
        
        
    }
}
