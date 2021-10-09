package mutltithreading;

import java.util.Queue;

public class Consumer implements Runnable{

    public Queue<Integer> queue;

    public Consumer(Queue<Integer> queue){
        this.queue = queue;
    }

    public void Consume(){
        System.out.println("i am consuming"+Thread.currentThread().getName());
        try{
            for (int i = 0; i < 10; i++) {
            synchronized (queue) {
                    if (!queue.isEmpty()) {
                        int x = queue.poll();
                        System.out.println("Consumeed : " + x);
                    } else {
                        i--;
                        queue.wait();
                        System.out.println("waiting");
                    }
                }
            }
        }catch(InterruptedException | IllegalMonitorStateException i){
            i.printStackTrace();
        }

    }

    @Override
    public void run() {
        System.out.println("Cunsumer Started....");
        this.Consume();
        System.out.println("Cunsumer Ended....");
    }
}
