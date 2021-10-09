package mutltithreading;

import java.util.ArrayDeque;
import java.util.Queue;

public class Broker {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Thread producer =  new Thread(new Producer(queue),"Producer");
        Thread consumer =  new Thread(new Consumer(queue),"Consumer");
        producer.start();
        consumer.start();
    }
}
