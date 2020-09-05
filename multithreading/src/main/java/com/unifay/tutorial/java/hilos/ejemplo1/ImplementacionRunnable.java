package com.unifay.tutorial.java.hilos.ejemplo1;

public class ImplementacionRunnable implements Runnable {

    private Thread hilo;
    private String hiloNombre;

    public ImplementacionRunnable(String hiloNombre) {
        this.hiloNombre = hiloNombre;
        System.out.println("Creando hilo " + hiloNombre);
    }

    @Override
    public void run() {

        System.out.println("Corriendo hilo " + hiloNombre);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Hilo: " + hiloNombre + ", "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
                System.out.println("Hilo: " + hiloNombre + " interrumpido.");
        }
                System.out.println("Hilo: " + hiloNombre + " saliendo.");
    }

    public void start() {

        System.out.println("Iniciando hilo "+ hiloNombre);
        if (hilo == null) {
            hilo = new Thread(this, hiloNombre);
            hilo.start();
        }
    }
}
