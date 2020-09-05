package com.unifay.tutorial.java.hilos.ejemplo1;

public class HiloImplementadoTester {

    public static void main(String[] args) {

        ImplementacionRunnable runnableA = new ImplementacionRunnable("Hilo-1");
        runnableA.start();

        ImplementacionRunnable runnableB = new ImplementacionRunnable("Hilo-2");
        runnableB.start();
//        runnableB.run();
    }
}
