package entidades;

public class TransporteTerra implements Transportacao {
    private final Veiculo veiculo;

    public TransporteTerra(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void transportar() {
        System.out.println("Transporte pela terra:");
        veiculo.mover();
    }
}
