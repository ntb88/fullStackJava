package SynchronizedEx;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;

    public MyThread(String name, DisplayMessage dm) {
        super();
        this.dm = dm;
        this.name = name;
    }

    public void run(){
        dm.sayHello(name);
    }
}
