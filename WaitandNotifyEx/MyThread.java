package WaitandNotifyEx;

public class MyThread extends Thread{
    int total;
    public void run(){
        System.out.println("Child thread is calculating sum!");

        synchronized (this){
            for(int i= 1; i<=100; i++){
                total+=i;
            }
            this.notify();
        }
    }

}
