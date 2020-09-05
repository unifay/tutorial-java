package com.unifay.tutorial.java.hilos.deadlockproblem;

public class DeadLockB extends Thread{

    private Object lockA;
    private Object lockB;

    public DeadLockB(Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    public void run() {
        synchronized (lockB) {
            System.out.println("Hilo 2: bloqueo mantenido 1...");
            try {
                Thread.sleep(10);

            } catch (InterruptedException exception) {
            }
                System.out.println("Hilo 2: Esperando por bloquedo 2...");
            synchronized (lockA) {
                System.out.println("Hilo 2: Bloqueo mantenido 1 y 2...");
            }
        }
    }
}
