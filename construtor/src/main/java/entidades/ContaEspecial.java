/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author aluno.den
 */
public class ContaEspecial extends Conta{
    
  private double limiteEmprestimo;
  private double limite;

    public ContaEspecial(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    public double getLimite(){
        return limite;
    }
    
    public void limite(double quantia){
        limite -= limiteEmprestimo + 10;
    }

}
    
   
    
