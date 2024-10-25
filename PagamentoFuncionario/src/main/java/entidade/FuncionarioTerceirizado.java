//Por: Renato Barreto

package entidade;

public class FuncionarioTerceirizado extends Funcionario
{
    private float bonus = 1.10f; // Valor equivale a 110
    private float despesaAdicional;
    
    public FuncionarioTerceirizado(String nome, int horaTrabalhada, float valorHora, float despesaAdicional)
    {
        super(nome, horaTrabalhada, valorHora);        
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public float pagamento()
    {
        float salario = horaTrabalhada * valorHora,
              acrescimo = despesaAdicional * bonus;
        return salario + acrescimo;
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
