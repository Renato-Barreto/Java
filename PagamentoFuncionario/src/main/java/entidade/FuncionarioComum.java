//Por: Renato Barreto

package entidade;

public class FuncionarioComum extends Funcionario
{
    public FuncionarioComum(String nome, int horaTrabalhada, float valorHora)
    {
        super(nome, horaTrabalhada, valorHora);
    }
    
    @Override
    public float pagamento()
    {
        return horaTrabalhada * valorHora;
    }
    
    @Override
    public String exibirDados()
    {
        float pagamentoFinal = pagamento();
        
        return "\nNome: " + nome
                + "\nHoras trabalhadas: " + horaTrabalhada
                + "\nValor por hora: R$ " + String.format("%.2f", valorHora)
                + "\nPagamento final: R$ " + String.format("%.2f", pagamentoFinal);
    }
}
