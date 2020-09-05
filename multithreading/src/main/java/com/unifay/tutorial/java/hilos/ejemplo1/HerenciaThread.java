package com.unifay.tutorial.java.hilos.ejemplo1;

public class HerenciaThread extends Thread {

    private Thread hilo;
    private String hiloName;

    public HerenciaThread(String hiloName) {
        this.hiloName = hiloName;
        System.out.println("Creando hilo " + hiloName);
    }

    public void run() {
        System.out.println("Running " + hiloName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Hilo: " + hiloName + ", " + i);
                Thread.sleep(50);
            }

        } catch (InterruptedException exception) {
            System.out.println("Hilo " + hiloName + " interrumpido.");
        }
        System.out.println("Hilo " + hiloName + " saliendo.");
    }

    public void start() {
        System.out.println("Iniciando " + hiloName);
        if (hilo == null) {
            hilo = new Thread(this, hiloName);
            hilo.start();
        }
    }
}
