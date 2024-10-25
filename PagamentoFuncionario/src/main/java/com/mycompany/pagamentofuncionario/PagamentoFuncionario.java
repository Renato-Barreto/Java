//Por: Renato Barreto

package com.mycompany.pagamentofuncionario;

import entidade.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PagamentoFuncionario 
{
    public static void main(String[] args) 
    {
        String nome;        
        float valorHora;
        int loop = 0,
            horaTrabalhada,
            quantFuncionario;
        
        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();                
        
        System.out.print("Insira a quantidade de funcionários para realizar o processo de pagamento: ");
        quantFuncionario = scan.nextInt();
        scan.nextLine();
        
        while (loop < quantFuncionario)
        {
            System.out.printf("\n%dº Funcionário, digite seu nome: ", loop+1);
            nome = scan.nextLine();
            System.out.print("Digite as horas trabalhadas: ");
            horaTrabalhada = scan.nextInt();
            System.out.print("Digite o valor recebido por hora: ");
            valorHora = scan.nextFloat();
            System.out.print("O funcionário em questão é terceirizado sim ou não? (S/N): ");
            char tipoFuncionario = scan.next().charAt(0);

            // Validando funcionário e inserindo as informações do ArrayList
            
            switch (tipoFuncionario) 
            {
                case 'S':
                case 's':
                    System.out.print("\nDigite o valor de despesa adicional: ");
                    float despesaAdicional = scan.nextFloat();
                    funcionarios.add(new FuncionarioTerceirizado(nome, horaTrabalhada, valorHora, despesaAdicional));
                    scan.nextLine();
                    break;
                    
                case 'N':
                case 'n':
                    funcionarios.add(new FuncionarioComum(nome, horaTrabalhada, valorHora));
                    scan.nextLine();
                    break;
            }
            
            // Iteração do laço para alcançar a quantidade de funcionários cadastrados
            
            loop++;
        }
        
        // Laço ForEach para exibir o ArrayList
        
        System.out.println("\nTabela de Pagementos de Funcionários");
        for (Funcionario func : funcionarios)
        {
            System.out.println(func.exibirDados());
        }
    }
}