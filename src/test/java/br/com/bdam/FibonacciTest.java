package br.com.bdam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void fibonacciTest1() {
        Fibonacci fibonacci = new Fibonacci();

        long res = fibonacci.encontraElementoPD(30);

        Assertions.assertEquals(832040, res);
    }

    @Test
    public void fibonacciTest2() {
        Fibonacci fibonacci = new Fibonacci();

        long res = fibonacci.encontraElementoPD(50);

        Assertions.assertEquals(12586269025L, res);
    }

    @Test
    public void fibonacciTest3() {
        Fibonacci fibonacci = new Fibonacci();

        long res = fibonacci.encontraElementoPD(90);

        Assertions.assertEquals(2880067194370816120L, res);
    }
}
