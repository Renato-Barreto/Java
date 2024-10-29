
package entidades;

public class Elefante extends Animal {

    public Elefante(String nome, String especie, String habitat) {
        super(nome, especie, habitat);
    }

    @Override
    public String emitirSom() {
       return("FUUUMM UUUUUh!!!");
    }

    @Override
    public String exibirDados() {
        return String.format("%S é um animal de espécie %S e vive nos(as) %S",nome,especie,habitat);
    }
    
}
