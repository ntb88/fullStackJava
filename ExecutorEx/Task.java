package ExecutorEx;

public class Task extends Thread{
    public void run(){
        System.out.println("Child class started!");
        //Print the name of the Thread
        System.out.println(Thread.currentThread().getName());
        //Put this thread into sleep for 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Print completed
        System.out.println("Task completed!");
    }
}
