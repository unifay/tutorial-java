package com.unifay.tutorial.java.hilos.comunicacion;

public class HiloB implements Runnable{

    Chat chat;
    String[] string = {"Hola", "Yo estoy muy bien aprendiendo hilos, que tal tu?", "Grandioso!"};

    public HiloB(Chat chat) {
        this.chat = chat;
        new Thread(this, "Respuesta").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < string.length; i++) {
            chat.Respuesta(string[i]);
        }
    }
}
