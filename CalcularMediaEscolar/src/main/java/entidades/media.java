
package entidades;

public class media {
    
    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;
    public double media;
   
    // Método para calcular a média e atualizar a variável de instância 'media'
    public void calcularMedia() {
        this.media = (primeiraNota + segundaNota + terceiraNota) / 3;
    }

    // Método para exibir o resultado com base na média calculada
    public void resultado() {
        // Certifique-se de calcular a média antes de determinar o resultado
        calcularMedia();
        if (this.media >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    // Método para calcular o valor faltante para alcançar a média de 60
    public double faltante() {
        return 60 - this.media;
    }
}
