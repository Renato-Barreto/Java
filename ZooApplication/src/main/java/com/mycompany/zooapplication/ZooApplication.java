package com.mycompany.zooapplication;

import entidades.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ZooApplication{

   
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        List<Animal> animais = new ArrayList<>();
        
        String nome;
        String especie;
        String habitat;
        
        while(true){
            
            System.out.println("Cadastre um novo animal");
            System.out.println("Digite o nome dado ao animal: ");
            nome = sc.nextLine();
                    
            System.out.println("Digite qual a espécie: ");
            especie = sc.nextLine();
            
            System.out.println("Digite qual seu habitat: ");
            habitat = sc.nextLine();
            
            System.out.println("Qual o animal cadastrado?");
            System.out.println("1 - Elefante");
            System.out.println("2 - Leao");
            System.out.println("3 - Papagaio");
            System.out.println("4 - Sair e exibir informações");
            int opcao = sc.nextInt();
            
            switch (opcao){
            
                case 1 -> {
                    animais.add (new Elefante(nome, especie, habitat));
                }
                
                case 2 -> {
                    animais.add (new Leao(nome, especie, habitat));
                }
                
                case 3 -> {
                    animais.add (new Papagaio(nome, especie, habitat));
                }
                
                case 4 -> {
                    break;
                }
               }
            }
        
        for (Animal animai : animais) {
            System.out.println(animai.exibirDados());
            System.out.println(animai.emitirSom());
        }
        
        
        
    }
}
