package com.unifay.tutorial.java.hilos.ejemplo2;

import java.util.concurrent.atomic.AtomicInteger;

public class AdivinaUnNumero extends Thread {

    private int numero;

    public AdivinaUnNumero(int numero) {
        this.numero = numero;
    }

    public void run() {
        int contador = 0;
        int adivinar = 0;
        long tiempoInicial = System.currentTimeMillis();
        do {
            adivinar = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " adivinar " + adivinar);
            contador++;
        } while (adivinar != numero);
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("** El numero " + numero + " adivinado por el hilo -> " + this.getName() + " en " + contador + " intentos en " + (tiempoFinal - tiempoInicial) + "ms");
    }
}
