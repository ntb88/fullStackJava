package ExecutorEx;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        //single
        //ExecutorService ex = Executors.newSingleThreadExecutor();

        //multi
        ExecutorService ex = Executors.newFixedThreadPool(5);

        System.out.println("Entry- The name of current Thread: "+ Thread.currentThread().getName());
        for(int i = 0; i<3; i++){
            ex.execute(new Task());
        }

    }


}
