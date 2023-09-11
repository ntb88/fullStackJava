package WaitandNotifyEx;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();

        synchronized (mt){
            System.out.println("main thread is going to wait");

            // main thread is put into wait mode
            mt.wait();
            // once child thread is done control flow is back
            System.out.println("Main thread is notified");
            System.out.println(mt.total);

        }
    }
}
