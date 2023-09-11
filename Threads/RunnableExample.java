package Threads;

public class RunnableExample implements Runnable {
    public static void main(String[] args) {
        RunnableExample re = new RunnableExample();
        Thread t = new Thread(re);

        //Start the thread
        t.start();

        for(int j = 0; j< 20; j++){
            System.out.println("j: "+ j);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    //override the run() method
    public void run(){
        for(int i = 0; i< 20; i++){
            System.out.println("i: "+ i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }

}
