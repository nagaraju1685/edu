package com.ml.consumerproducer.synchroize;

import java.util.ArrayDeque;
import java.util.Queue;

class Consumer implements Runnable{
    private Queue<Integer> queue = null;

    public Consumer(){}
    public Consumer(Queue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        consume();
    }

    public void consume() {

        try {
            for (int i = 0; i < 10; i++) {
              synchronized (queue) {
                  if (queue.size() == 0) {
                      i--;
                      System.out.println("Consumer in waiting state");
                      queue.wait();
                      System.out.println("Consumer out from waiting state");
                  } else {
                      int x = queue.poll();
                      System.out.println("Consumer consumed : " + x);
                  }
              }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer implements Runnable{

    private Queue<Integer> queue = null;

    public Producer(){}
    public Producer(Queue<Integer> queue){
            this.queue = queue;
   }

    @Override
    public void run() {
        produce();
    }

    public void produce(){
        for (int i = 0; i < 10; i++) {
            synchronized (queue) {
                queue.add(i);
                System.out.println("Producer produced : " + i);
                queue.notify();
            }
        }
    }
}


public class Broker {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Thread consumer = new Thread(new Consumer(queue),"Consumer");
        Thread producer = new Thread(new Producer(queue),"Producer");
        consumer.start();
        producer.start();

    }

}
