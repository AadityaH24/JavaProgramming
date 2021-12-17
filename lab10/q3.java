import java.util.*;
public class q3 {
    public static void main(String[] args) throws InterruptedException
    {
        ProducerConsumer pc = new ProducerConsumer ();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    
}

final class ProducerConsumer {
    LinkedList<Integer> list = new LinkedList<>();
    int storage = 2;
    public void produce() throws InterruptedException
    {
        int value = 0;
        while (true) {
            
            synchronized (this)
            {
                while (list.size() == storage)
                    wait();

                System.out.println("Produced:  "+ value);


                list.add(value++);
                notify();
                
            }
        }
    }
    public void consume() throws InterruptedException
    {
        while (true) {
            Thread.sleep(1000);
            synchronized (this)
            {
                while (list.size() == 0)
                    wait();
                int val = list.removeFirst();

                System.out.println("Consumed:  "+ val);

                notify();
            }
        }
    }
}