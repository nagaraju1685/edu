package mutltithreading;

import java.util.Queue;

public class Producer implements Runnable{
    public Queue<Integer> queue;

    public Producer(Queue<Integer> queue){
        this.queue = queue;
    }

    public void produce() {
        System.out.println("I am producing : "+Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
            synchronized (queue) {
                    System.out.println("Produced : " + i);
                    queue.add(i);
                    queue.notify();
                }
            }
        }catch(InterruptedException | IllegalMonitorStateException i){
            i.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Producer started....");
        this.produce();
        System.out.println("Producer Ended....");
    }
}
