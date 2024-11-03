package br.com.bdam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcuradoraTest {

    @Test
    public void somaTest() {
        Calculadora calc = new Calculadora();

        int res = calc.soma(2, 3);

        Assertions.assertEquals(5, res);
    }

    @Test
    public void subtrairTest() {
        Calculadora calc = new Calculadora();

        int res = calc.subtrair(5, 3);

        Assertions.assertEquals(2, res);
    }

    @Test
    public void multiplicarTest() {
        Calculadora calc = new Calculadora();

        int res = calc.multiplicar(2, 3);

        Assertions.assertEquals(6, res);
    }

    @Test
    public void dividirTest() {
        Calculadora calc = new Calculadora();

        int res = calc.dividir(20, 4);

        Assertions.assertEquals(5, res);
    }
}
