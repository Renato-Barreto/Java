
package entidades;

public class Carro extends Veiculo{
    
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String digirir() {
        return String.format("Digirindo um carro %s %s com %d portas", marca, modelo, quantidadePortas);
    }

    @Override
    public String exibirDetalhes() {
        return String.format("\nMarca: %s\nModelo: %s", marca, modelo);
    }
    
}
