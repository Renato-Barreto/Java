/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class media {
    
    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;
    public double media;
    
   
    public double calcularMedia(double media){
        media = (primeiraNota + segundaNota + terceiraNota)/3;
        return media;
    }
    
    public void resultado (String situacao){
        if (media >= 60){
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }   
    }
    
    public double faltante(double media){
        return 60 - media;
    }
    
    
}
