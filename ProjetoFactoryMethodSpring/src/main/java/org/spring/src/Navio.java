package org.spring.src;

public class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega realizada por navio.");
    }
}