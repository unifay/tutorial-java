package com.unifay.tutorial.java.hilos.sincronizacion;

import java.text.MessageFormat;

public class HiloSinc extends Thread {

    private Thread hilo;
    private String hiloNombre;
    Imprimir imprimir;

    public HiloSinc(String hiloNombre, Imprimir imprimir) {
        this.hiloNombre = hiloNombre;
        this.imprimir = imprimir;
    }

    public void run() {

        synchronized (imprimir) {
            imprimir.imprimirContador(hiloNombre);
        }
        System.out.println(MessageFormat.format("Hilo {0} saliendo...", hiloNombre));
    }

    public void start() {
        System.out.println(MessageFormat.format("Iniciando el hilo {0}", hiloNombre));
        if (hilo == null) {
            hilo = new Thread(this, hiloNombre);
            hilo.start();
        }
    }
}
