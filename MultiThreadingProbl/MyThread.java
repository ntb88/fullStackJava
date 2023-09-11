package MultiThreadingProbl;

public class MyThread extends Thread{
    public void run(){

        System.out.println("Thread name "+ Thread.currentThread().getName());
        for(int i=0; i< 5; i++){
            System.out.println("i: "+ i+"\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Child thread exit");
                }
        }

    }

}
