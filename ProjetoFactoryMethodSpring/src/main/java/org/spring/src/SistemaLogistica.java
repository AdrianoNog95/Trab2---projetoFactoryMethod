package org.spring.src;

public class SistemaLogistica {
    public static void main(String[] args) {
        TransporteFactory factory = new TransporteFactory();

        Transporte transporte1 = factory.criarTransporte("carro");
        transporte1.entregar(); // Saída: Entrega realizada por carro.

        Transporte transporte2 = factory.criarTransporte("caminhao");
        transporte2.entregar(); // Saída: Entrega realizada por caminhão.

        Transporte transporte3 = factory.criarTransporte("navio");
        transporte3.entregar(); // Saída: Entrega realizada por navio.
    }
}
