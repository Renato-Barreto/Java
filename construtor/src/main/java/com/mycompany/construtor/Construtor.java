
package com.mycompany.construtor;
import java.util.Scanner;
import java.util.Locale;
import entidades.Conta;
import entidades.ContaEspecial;

public class Construtor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        ContaEspecial contaEspecial;
        int number;
        
        
        System.out.println("Insira o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Insira o nome do titular da conta: ");
        String titular = sc.nextLine();
        
        System.out.println("Informe se há depósito inicial: (y/n)");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 'y'){
            System.out.println("Informe o valor do depósito: ");
            double depInicial = sc.nextDouble();
            conta = new Conta(numero, titular);
        }else{
            conta = new Conta(numero, titular);
        }
        
        System.out.println(conta);
        
        System.out.println("Informe o valor do seu depósito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);
        
        System.out.println(conta);
        
        System.out.println("Informe o valor do seu saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        
        System.out.println(conta);
        
        
        System.out.println("Qual seu tipo de conta? (1) Conta Pf (2) Conta Pj");
        number = sc.nextInt();
        
        if(number == 1){
        
        } else {
        
        System.out.println("Informe o valor do seu limite de empréstimo: ");
        double limiteEmprestimo = sc.nextDouble();
        contaEspecial.limiteEmpréstimo;
            
        }
        
    }
}
