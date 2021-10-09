package com.ml.consumerproducer.lock;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Consumer implements Runnable{
    private Queue<Integer> queue;
    private Lock lock;
    private Condition condition;
    public Consumer(){}
    public Consumer(Queue<Integer> queue,Lock lock,Condition condition){

        this.queue = queue;
        this.lock = lock;
        this.condition = condition;
    }


    @Override
    public void run() {
        consume();
    }

    public void consume(){
        try {
            for (int i = 0; i < 10; i++) {
                    lock.lock();
                    if(queue.size()==0){
                        i--;
                        condition.await();
                    }else{
                        int x = queue.poll();
                        System.out.println("Consumer consume : "+x);
                    }
                   // lock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
}

class Producer implements Runnable{
    private Queue<Integer> queue;
    private Lock lock;
    private Condition condition;

    public Producer(){}
    public Producer(Queue<Integer> queue,Lock lock,Condition condition){

        this.queue = queue;
        this.lock = lock;
        this.condition = condition;
    }
    @Override
    public void run() {
        produce();
    }

    public void produce(){
        try {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                queue.add(i);
                condition.signal();
                Thread.sleep(1000);
                System.out.println("Producer produce : "+i);
                lock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Broker {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition con = lock.newCondition();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Thread consumer =  new Thread(new Consumer(queue,lock,con),"Consumer");
        Thread producer =  new Thread(new Producer(queue,lock,con),"Producer");

        consumer.start();
        producer.start();

    }

}
