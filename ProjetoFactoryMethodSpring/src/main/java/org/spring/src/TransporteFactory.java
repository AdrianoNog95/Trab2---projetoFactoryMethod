package org.spring.src;

public class TransporteFactory {

    public Transporte criarTransporte(String tipo) {
        if (tipo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("caminhao")) {
            return new Caminhao();
        } else if (tipo.equalsIgnoreCase("navio")) {
            return new Navio();
        }
        throw new IllegalArgumentException("Tipo de transporte desconhecido.");
    }
}
