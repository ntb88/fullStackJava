package SynchronizedThreadsProblem;

import java.util.Scanner;

public class Counter extends Thread{

    Storage st = new Storage(3);

    public void run(){
        //st.sync(5);
        for(int i = 0; i<st.number; i++){
            System.out.println("From Counter: " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
