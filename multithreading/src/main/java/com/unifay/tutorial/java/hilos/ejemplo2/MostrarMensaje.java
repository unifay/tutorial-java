package com.unifay.tutorial.java.hilos.ejemplo2;

public class MostrarMensaje implements Runnable{

    private String mensaje;

    public MostrarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        int loop = 0;
        while (true) {
            System.out.println("Loop "+loop++);
            System.out.println(mensaje);
        }
    }
}
