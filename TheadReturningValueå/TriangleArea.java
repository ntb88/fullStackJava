package TheadReturningValueå;

import java.util.concurrent.Callable;

public class TriangleArea implements Callable {
    int base ;
    int height;
    int area = 0;

    public TriangleArea(int base, int height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public Object call() throws Exception {
        return area = base * height /2;
    }
}
