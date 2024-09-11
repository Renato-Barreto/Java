package entidades;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public Conta(int numero, String titular, double inicialDeposito) {
        this.numero = numero;
        this.titular = titular;
        deposito(inicialDeposito);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        saldo -= quantia + 5.0;
    }

    @Override
    public String toString() {
        return "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}