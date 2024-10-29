/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author aluno.den
 */
public abstract class ItemBiblioteca 
{
    protected String titulo;
    protected String codigo;
    
    public ItemBiblioteca(String titulo, String codigo)
    {
        this.titulo = titulo;
        this.codigo = codigo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
        
    public abstract String exibirDetalhes();
}
