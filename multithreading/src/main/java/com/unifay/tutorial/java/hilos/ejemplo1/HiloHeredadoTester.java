package com.unifay.tutorial.java.hilos.ejemplo1;

public class HiloHeredadoTester {

    public static void main(String[] args) {

        HerenciaThread herenciaThreadA = new HerenciaThread("Hilo-1");
        herenciaThreadA.start();

        HerenciaThread herenciaThreadB = new HerenciaThread("Hilo-2");
        herenciaThreadB.start();
    }
}
