package com.unifay.tutorial.java.hilos.comunicacion;

public class HilosTester {

    public static void main(String[] args) {

        Chat chat = new Chat();
        new HiloA(chat);
        new HiloB(chat);
    }
}
