package org.spring.src;

public class Caminhao implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega realizada por caminhão.");
    }
}