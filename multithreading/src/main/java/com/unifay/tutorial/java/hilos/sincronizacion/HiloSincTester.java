package com.unifay.tutorial.java.hilos.sincronizacion;

public class HiloSincTester {

    public static void main(String[] args) {

        Imprimir imprimir = new Imprimir();

        HiloSinc hiloA = new HiloSinc("Hilo - A ", imprimir);
        HiloSinc hiloB = new HiloSinc("Hilo - B ", imprimir);

        hiloA.start();
        hiloB.start();

        //se espera por que los hilos terminen
        try {
            hiloA.join();
            hiloB.join();
        } catch (InterruptedException exception) {
            System.out.println("Interrupcion!");
        }

    }
}
