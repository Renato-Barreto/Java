/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class EstoqueClass {
    private String nome;
    private double preco;
    private int quantidade;
    
    
    public EstoqueClass(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade ;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

 //----------------------------------------------//
    
    public void AddProduto(int quantia) {
        quantidade += quantia;
    }

    public void RemoverProduto(int quantia) {
        quantidade -= quantia;
    }
    
    public double ValorTotal(){
        
        return quantidade * preco;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return ", Nome: "
                + nome
                + ", preço: $ "
                + preco
                + ", Quantidade em estoque: "
                + quantidade
                + "Valor total em estoque:" + ValorTotal();
    }
}
