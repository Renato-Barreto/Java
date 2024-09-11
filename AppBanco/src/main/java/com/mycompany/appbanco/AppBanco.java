package com.mycompany.appbanco;

import java.util.Scanner;
import java.util.Locale;
import entidades.Conta;
import entidades.ContaEspecial;

public class AppBanco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Insira o numero da conta: ");
        int numero = sc.nextInt();

        System.out.print("Insira o titular da conta: ");
        sc.nextLine();

        String titular = sc.nextLine();
        System.out.print("Existe um deposito inicial (y/n)? ");

        char resposta = sc.next().charAt(0);
        System.out.print("A conta é especial (y/n)? ");
        char contaEspecial = sc.next().charAt(0);

        if (contaEspecial == 'y') {
            System.out.print("Insira o limite de empréstimo: ");
            double limiteEmprestimo = sc.nextDouble();

            if (resposta == 'y') {
                System.out.print("Insira o valor do deposito inicial: ");
                double inicialDeposito = sc.nextDouble();
                conta = new ContaEspecial(numero, titular, inicialDeposito, limiteEmprestimo);
            } else {
                conta = new ContaEspecial(numero, titular, limiteEmprestimo);
            }
        } else {
            if (resposta == 'y') {
                System.out.print("Insira o valor do deposito inicial: ");
                double inicialDeposito = sc.nextDouble();
                conta = new Conta(numero, titular, inicialDeposito);
            } else {
                conta = new Conta(numero, titular);
            }
        }

        System.out.println();
        System.out.println("Dados da Conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira um valor de deposito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira um valor de retirada: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        if (conta instanceof ContaEspecial) {
            ContaEspecial contaEsp = (ContaEspecial) conta;

            System.out.println();
            System.out.print("Deseja realizar um empréstimo (y/n)? ");
            char emprestimoResposta = sc.next().charAt(0);
            if (emprestimoResposta == 'y') {
                System.out.print("Informe o valor do empréstimo: ");
                double valorEmprestimo = sc.nextDouble();
                contaEsp.emprestimo(valorEmprestimo);
                System.out.println("Dados da conta após empréstimo:");
                System.out.println(contaEsp);
            }
        }

        sc.close();
    }
}