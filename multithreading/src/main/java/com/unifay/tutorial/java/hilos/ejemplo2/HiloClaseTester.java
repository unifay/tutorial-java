package com.unifay.tutorial.java.hilos.ejemplo2;

public class HiloClaseTester {

    public static void main(String[] args) {

        Runnable hola = new MostrarMensaje("Hola");
        Thread hiloA = new Thread(hola);
        hiloA.setDaemon(true);
        hiloA.setName("hola");
        System.out.println("Iniciando Hilo Hola...");
        hiloA.start();

        Runnable chao = new MostrarMensaje("Chao");
        Thread hiloB = new Thread(chao);
        hiloB.setPriority(Thread.MIN_PRIORITY);
        hiloB.setDaemon(true);
        System.out.println("Iniciando Hilo Chao");
        hiloB.start();

        System.out.println("Iniciando Hilo C...");
        Thread hiloC = new AdivinaUnNumero(50);
        hiloC.setName("Hilo C");
        hiloC.start();
        try {
            hiloC.join();
        } catch (InterruptedException exception) {
            System.out.println("Hilo interrumpido.");
        }

        System.out.println("Iniciando Hilo D ");
        Thread hiloD = new AdivinaUnNumero(50);
        hiloD.setName("Hilo D");
        hiloD.start();

        System.out.println("Metodo main() esta terminando...");
    }
}
