package entidades;

public abstract class Animal {
    
    protected String nome;
    protected String especie;
    protected String habitat;
    
    public Animal(String nome, String especie, String habitat){
        this.nome = nome;
        this.especie = especie;
        this.habitat = habitat;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getEspecie()
    {
        return especie;
    }
    
    public String getHabitat()
    {
        return habitat;
    }
    
    public abstract String emitirSom();
    public abstract String exibirDados();
    
    
}
