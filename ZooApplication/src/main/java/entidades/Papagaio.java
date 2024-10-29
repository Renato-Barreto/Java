
package entidades;

public class Papagaio extends Animal {

    public Papagaio(String nome, String especie, String habitat) {
        super(nome, especie, habitat);
    }

    @Override
    public String emitirSom() {
       return("aaAAAAHH!!!");
    }

    @Override
    public String exibirDados() {
        return String.format("%S é um animal de espécie %S e vive nos(as) %S",nome,especie,habitat);
    }
    
}
