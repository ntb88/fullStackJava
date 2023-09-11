package SynchronizedThreadsProblem;

import java.util.Random;

public class Storage extends Thread {
    int number;

    public Storage(int number){
        this.number = number;
    }

    /*
    public void sync( int n ){
        this.number = n;
    }

     */


}
