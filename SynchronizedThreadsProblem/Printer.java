
package SynchronizedThreadsProblem;

public class Printer extends Thread{
    Storage st = new Storage(3);


    public void run(){

        for(int i = 0;  i<st.number; i++){
            System.out.println("From printer :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


