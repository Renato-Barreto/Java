

package com.mycompany.calcularmediaescolar;
import java.util.Scanner;
import entidades.media;

public class CalcularMediaEscolar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        media escola = new media();
        
        System.out.println("Digite a seu nome: ");
        escola.nome = sc.nextLine();
        
        System.out.println("Digite a sua primeira nota:");
        escola.primeiraNota = sc.nextDouble();
        
        System.out.println("Digite a sua segunda nota: ");
        escola.segundaNota = sc.nextDouble();
        
        System.out.println("Digite a sua segunda nota: ");
        escola.terceiraNota = sc.nextDouble();
        
        escola.calcularMedia();
        
        System.out.print("Olá " + escola.nome + " informamos que você foi: ");
        escola.resultado();
        
        if(escola.media < 60){
            System.out.println("Faltam " + escola.faltante() + " ponto(s)");
        }

    }
}
