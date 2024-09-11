package entidades;

public class ContaEspecial extends Conta {

    private double limiteEmprestimo;

    // Construtor com depósito inicial e limite de empréstimo
    public ContaEspecial(int numero, String titular, double inicialDeposito, double limiteEmprestimo) {
        super(numero, titular, inicialDeposito);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    // Construtor sem depósito inicial, apenas com limite de empréstimo
    public ContaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    // Método para realizar empréstimo
    public void emprestimo(double valor) {
        double taxa = 10.0;
        if (valor <= limiteEmprestimo) {
            limiteEmprestimo -= valor;
            deposito(valor - taxa);
        } else {
            System.out.println("Empréstimo não aprovado. Valor excede o limite de empréstimo.");
        }
    }

    // Método para obter o limite de empréstimo
    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite de Empréstimo: $ " + String.format("%.2f", limiteEmprestimo);
    }
}
