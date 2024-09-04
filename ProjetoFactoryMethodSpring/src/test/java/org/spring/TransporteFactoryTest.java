package org.spring;

import org.spring.src.Transporte;
import org.spring.src.Carro;
import org.spring.src.Caminhao;
import org.spring.src.Navio;
import org.spring.src.TransporteFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransporteFactoryTest {

    @Test
    public void testCriarCarro() {
        TransporteFactory factory = new TransporteFactory();
        Transporte transporte = factory.criarTransporte("carro");
        assertNotNull(transporte);
        assertTrue(transporte instanceof Carro);
        transporte.entregar();
    }

    @Test
    public void testCriarCaminhao() {
        TransporteFactory factory = new TransporteFactory();
        Transporte transporte = factory.criarTransporte("caminhao");
        assertNotNull(transporte);
        assertTrue(transporte instanceof Caminhao);
        transporte.entregar();
    }

    @Test
    public void testCriarNavio() {
        TransporteFactory factory = new TransporteFactory();
        Transporte transporte = factory.criarTransporte("navio");
        assertNotNull(transporte);
        assertTrue(transporte instanceof Navio);
        transporte.entregar();
    }

    @Test
    public void testCriarTransporteInvalido() {
        TransporteFactory factory = new TransporteFactory();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.criarTransporte("avião");
        });
        assertEquals("Tipo de transporte desconhecido.", exception.getMessage());
    }
}
