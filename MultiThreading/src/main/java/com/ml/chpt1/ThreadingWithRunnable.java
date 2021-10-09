package com.ml.chpt1;

class Runner1 implements Runnable {
    public void run() {
        try {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1 :" + i);
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner1 Finished..");
    }
}

class Runner2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runner2 :" + i);
            }
            ThreadingWithRunnable.t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner2 Finished..");
    }
}


public class ThreadingWithRunnable {

    static Thread t1 = null;
    static Thread t2 = null;

    public static void main(String[] args) throws InterruptedException {
        t1 = new Thread(new Runner1());
        t2 = new Thread(new Runner2());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Main Finished..");
    }
}
