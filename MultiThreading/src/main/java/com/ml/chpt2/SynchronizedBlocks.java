package com.ml.chpt2;

public class SynchronizedBlocks {
    public static int counter = 0;

    public void increment(){
        synchronized (this){
            counter++;
        }
    }

    public static void main(String[] args) {

        SynchronizedBlocks sb = new SynchronizedBlocks();
        Thread worker1  = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sb.increment();
               }

        });

        Thread worker2  = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sb.increment();
            }
        });

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
