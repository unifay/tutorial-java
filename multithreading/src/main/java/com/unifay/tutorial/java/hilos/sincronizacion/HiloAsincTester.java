package com.unifay.tutorial.java.hilos.sincronizacion;

public class HiloAsincTester {

    public static void main(String[] args) {

        Imprimir imprimir = new Imprimir();

        HiloAsinc hiloA = new HiloAsinc("Hilo - A ", imprimir);
        HiloAsinc hiloB = new HiloAsinc("Hilo - B ", imprimir);

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
