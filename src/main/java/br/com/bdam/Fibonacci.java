package br.com.bdam;

public class Fibonacci {
    private static final int MAX_ELEMENTOS = 100;
    private long[] fibElementos = new long[MAX_ELEMENTOS];

    public long encontraElementoPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            fibElementos[i] = -1;
        }

        return encontraElemento(n);
    }

    public long encontraElemento(int n) {
        if (fibElementos[n] == -1) {
            if (n <= 1) {
                fibElementos[n] = n;
            } else {
                fibElementos[n] = encontraElemento(n - 1) + encontraElemento(n - 2);
            }
        }
        return fibElementos[n];
    }
}
