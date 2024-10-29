
package entidades;

public class Moto extends Veiculo{
    
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String digirir() {
        return String.format("Digirindo uma moto %s %s com %d cilindradas", marca, modelo, cilindradas);
    }

    @Override
    public String exibirDetalhes() {
        return String.format("\nMarca: %s\nModelo: %s", marca, modelo);
    }
    
}
