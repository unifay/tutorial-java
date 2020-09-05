package com.unifay.tutorial.java.hilos.deadlockproblem;

public class DeadLockA extends Thread{

    private Object lockA;
    private Object lockB;

    public DeadLockA(Object lockA,Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    public void run() {
        synchronized (lockA) {
            System.out.println("Hilo 1: bloqueo mantenido 1...");
            try {
                Thread.sleep(10);

            } catch (InterruptedException exception) {
            }
                System.out.println("Hilo 1: Esperando por bloquedo 2...");
            synchronized (lockB) {
                System.out.println("Hilo 1: Bloqueo mantenido 1 y 2...");
            }
        }
    }
}
