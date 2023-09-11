package TheadReturningValueå;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e = Executors.newSingleThreadExecutor();

        TriangleArea ta = new TriangleArea(10,7);

        Future<Integer> future = e.submit(ta);
        System.out.println("The area of triangle with dimensions of:  "+ta.base + " and : "+ ta.height +" is: "+future.get());

        e.shutdown();
    }
}
