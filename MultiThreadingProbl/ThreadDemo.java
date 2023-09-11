package MultiThreadingProbl;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.setPriority(MAX_PRIORITY);
        mt1.setName("Thread 1");
        mt2.setName("Thread 2");
        mt2.setPriority(MIN_PRIORITY);

        mt1.start();
        mt2.start();


        for(int j=1; j<5; j++){
            System.out.println("j: "+ j+"\n");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
