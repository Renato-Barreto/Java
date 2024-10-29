
package entidades;

public class Leao extends Animal{

    public Leao(String nome, String especie, String habitat) {
        super(nome, especie, habitat);
    }

    @Override
    public String emitirSom() {
        return String.format("ROOOOAAR!!!");
    }

    @Override
    public String exibirDados() {
        return String.format("%S é um animal de espécie %S e vive nos(as) %S",nome,especie,habitat);
    }
    
    
    
}
