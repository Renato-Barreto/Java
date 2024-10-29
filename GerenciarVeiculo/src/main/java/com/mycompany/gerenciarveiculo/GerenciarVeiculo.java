

package com.mycompany.gerenciarveiculo;

import entidades.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarVeiculo {

    public static void main(String[] args) {
      int quantidadeDeVeiculo;
        String marca,
               modelo;
        
        Scanner scan = new Scanner(System.in);
        List<Veiculo> automovel = new ArrayList<>();
        
        System.out.print("Digite a quantidade de automóveis: ");
        quantidadeDeVeiculo = scan.nextInt();
        scan.nextLine(); // Limpar tecla Enter do teclado
        
        for (int a = 0; a < quantidadeDeVeiculo; a++)
        {
            System.out.print("\nInforme a marca/fabricante do automóvel: ");
            marca = scan.nextLine();
            System.out.print("Informe o modelo: ");
            modelo = scan.nextLine();
            System.out.print("Informe se o automóvel é um Carro ou Moto: ");
            String tipoAutomovel = scan.nextLine();            
            
            
            if (tipoAutomovel.equalsIgnoreCase("carro"))
            {
                System.out.print("\nDigite a quantidade de portas: ");
                byte numeroDePortas = scan.nextByte();
                scan.nextLine();
                automovel.add(new Carro(marca, modelo, numeroDePortas));
            }
            else if (tipoAutomovel.equalsIgnoreCase("moto"))
            {
                System.out.print("\nDigite a cilindrada da moto: ");
                short cilindrada = scan.nextShort();
                scan.nextLine();
                automovel.add(new Moto(marca, modelo, cilindrada));
            }
            else 
            {
                a--;
            }
        }
        
        for (int x = 0; x < automovel.size(); x++)
        {
            System.out.println(automovel.get(x).exibirDetalhes());
            System.out.println(automovel.get(x).digirir());
        }
    }
}