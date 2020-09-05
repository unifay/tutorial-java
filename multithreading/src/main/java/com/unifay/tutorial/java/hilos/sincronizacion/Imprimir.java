package com.unifay.tutorial.java.hilos.sincronizacion;

import java.text.MessageFormat;

public class Imprimir {

    public void imprimirContador(String hiloNombre) {

        String ejecutor = (hiloNombre.isEmpty()) ? "Hilo sin nombre" : hiloNombre;

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(MessageFormat.format("Contador --- {0} ejecutado por {1}", i, ejecutor));
            }
        } catch (Exception e) {
            System.out.println("Hilo interrumpido!");
        }
    }
}
