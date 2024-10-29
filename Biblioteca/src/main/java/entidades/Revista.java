/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public class Revista extends ItemBiblioteca
{
    private String mesPublicacao;
    private short edicao;
    
    public Revista(String titulo,String codigo, String mesPublicacao, short edicao)
    {
        super(titulo, codigo);
        this.mesPublicacao = mesPublicacao;
        this.edicao = edicao;
    }
    
    public String getMesPublicacao()
    {
        return mesPublicacao;
    }
    
    public short getEdicao()
    {
        return edicao;
    }    
  
    @Override
    public String exibirDetalhes()
    {        
        return String.format("\nObra: %s\nMês de publicação: %s\nCódigo: %s\nEdição: %d", 
                titulo, mesPublicacao, codigo, edicao);
    }
}
