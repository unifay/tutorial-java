package com.unifay.tutorial.java.hilos.comunicacion;

/**
 * Esta clase de ejemplo muestra como se pueden comunicar dos hilos usando los metodos
 * wait() y notify(). Se pueden crear sistemas complejos usando el mismo concepto.
 */
public class Chat {

    boolean flag = false;

    public synchronized void Pregunta(String mensaje) {
        System.out.println("boolean "+flag);
        if (flag) {
            try {
                wait();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(mensaje);
        flag = true;
        notify();
    }

    public synchronized void Respuesta(String mensaje) {

        if (!flag) {
            try {
                wait();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(mensaje);
        flag = false;
        notify();
    }
}
