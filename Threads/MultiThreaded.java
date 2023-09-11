package Threads;

public class MultiThreaded extends Thread{
    public static void main(String[] args) {

        //create 2 objects of multithreaded
        MultiThreaded mt1 = new MultiThreaded();
        mt1.setPriority(MAX_PRIORITY);
        mt1.setName("mt1");
        mt1.start();

        MultiThreaded mt2 = new MultiThreaded();
        mt2.setPriority(MIN_PRIORITY);
        mt2.setName("mt2");
        mt2.start();

        for(int j=1; j<20; j++){
            System.out.println("j: "+ j+"\n");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    // After extending Thread class second step is overriding run()
    // run is a method that is automatically created by Thread class
    // We are just customizing it
    //
    public void run(){
        //Print the thread name
        System.out.println("Thread name: "+ Thread.currentThread().getName());

        for(int i=0; i < 20; i++){
            System.out.print("i: "+ i +"\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child thread exiting!");
            }
        }

    }
}
