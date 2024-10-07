package entidades;

public class TransporteAr implements Transportacao {
    private final Veiculo veiculo;

    public TransporteAr(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void transportar() {
        System.out.println("Transporte pelo ar:");
        veiculo.mover();
    }
}
