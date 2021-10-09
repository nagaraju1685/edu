package com.ml.chpt2;



class Worker1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizeMethod.increment();
        }
    }
}

class Worker2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizeMethod.increment();
        }
    }
}


public class SynchronizeMethod {

    public static synchronized void increment(){
        counter++;
    }

    public static int counter = 0;

    public static void main(String[] args) {
        Thread worker1  = new Thread(new Worker1());
        Thread worker2  = new Thread(new Worker2());
        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);

    }

}
