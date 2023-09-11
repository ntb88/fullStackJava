package SynchronizedThreadsProblem;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.start();

        Printer p = new Printer();
        p.start();

    }
}
