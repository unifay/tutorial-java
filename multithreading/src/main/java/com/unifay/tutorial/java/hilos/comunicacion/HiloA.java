package com.unifay.tutorial.java.hilos.comunicacion;

public class HiloA implements Runnable{

    Chat chat;
    String[] string = {"Hola", "Como estas?", "Yo tambien estoy aprendiendo mucho sobre hilos!"};

    public HiloA(Chat chat) {
        this.chat = chat;
        new Thread(this, "Pregunta").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < string.length; i++) {
            chat.Pregunta(string[i]);
        }
    }
}
