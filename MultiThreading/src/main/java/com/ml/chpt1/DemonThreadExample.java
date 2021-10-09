package com.ml.chpt1;

class DemonWorker implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("DemonWorker  :" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Worker implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker  :" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DemonThreadExample {
    public static void main(String[] args) {
        Thread w = new Thread(new Worker());
        Thread dw = new Thread(new DemonWorker());
        // demon threasd always have low priority
        // this will automaticall terminated if all other threads are finished.
        //  even it its did not finished his work jvm will kill this guy if all others thread done there work.
        dw.setDaemon(true);

        w.start();
        dw.start();


    }

}
