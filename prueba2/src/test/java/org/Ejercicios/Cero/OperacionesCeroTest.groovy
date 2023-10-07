package org.Ejercicios.Cero

import org.junit.jupiter.api.Test

class OperacionesCeroTest {
    OperacionesCero operaciones = new OperacionesCero()

    @Test
    void testSuma() {
        int result = operaciones.suma()
        assert result == 0
    }

    @Test
    void testResta() {
        int result = operaciones.resta()
        assert result == 0
    }

    @Test
    void testDivision() {
        int result = operaciones.division()
        assert result == 0
    }

    @Test
    void testMultiplicacion() {
        int result = operaciones.multiplicacion()
        assert result == 0
    }

    @Test
    void testImprimirNombre() {
        String result = operaciones.imprimirNombre()
        assert result == "replaceMeWithExpectedResult"
    }

    @Test
    void testImprimirDatos() {
        String result = operaciones.imprimirDatos()
        assert result == "replaceMeWithExpectedResult"
    }

    @Test
    void testConversionDeEurosAPesetas() {
        float result = operaciones.conversionDeEurosAPesetas()
        assert result == 0f
    }

    @Test
    void testConversionDePesetasAEuros() {
        double result = operaciones.conversionDePesetasAEuros()
        assert result == 0d
    }

    @Test
    void testCalculoTotalFactura() {
        float result = operaciones.calculoTotalFactura()
        assert result == 0f
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme