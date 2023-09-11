package SynchronizedEx;

public class DisplayMessage {
    public synchronized void sayHello(String name){
        for(int i = 0;  i<10; i++){
            System.out.println("How are you "+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
