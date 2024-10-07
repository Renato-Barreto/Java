
package com.mycompany.bridge;
import entidades.*;

public class Bridge {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo aviao = new Aviao();

        Transportacao terrestre = new TransporteTerra(carro);
        Transportacao aereo = new TransporteAr(aviao);

        terrestre.transportar();
        aereo.transportar();  

    }
}
