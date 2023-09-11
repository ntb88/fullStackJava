package SynchronizedEx;

import SynchronizedEx.MyThread;

public class SynchronizedDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        MyThread t1 = new MyThread("Nikhil", dm);
        MyThread t2 = new MyThread("Allen", dm);

        t1.start();
        t2.start();

    }
}
