package com.unifay.tutorial.java.hilos.deadlockproblem;

public class DeadLockTester {

    public static Object lockA = new Object();
    public static Object lockB = new Object();

    public static void main(String[] args) {

        DeadLockA deadLockA = new DeadLockA(lockA, lockB);
        DeadLockB deadLockB = new DeadLockB(lockA, lockB);
        deadLockA.start();
        deadLockB.start();

    }

}
