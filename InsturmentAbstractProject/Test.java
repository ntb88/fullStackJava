package abstractexample.InsturmentAbstractProject;

import java.sql.Array;

public class Test {
    public static void main(String[] args) {
        // System.out.println("Hello test");

        Instrument[] instrArr = new Instrument[10];

        instrArr[0] = new Piano();
        instrArr[0].play();

        instrArr[1] = new Guitar();
        instrArr[1].play();

        instrArr[2] = new Flute();
        instrArr[2].play();

        instrArr[3] = new Piano();
        instrArr[3].play();

        instrArr[4] = new Guitar();
        instrArr[4].play();

        instrArr[5] = new Flute();
        instrArr[5].play();

        instrArr[6] = new Piano();
        instrArr[6].play();

        instrArr[7] = new Guitar();
        instrArr[7].play();

        instrArr[8] = new Flute();
        instrArr[8].play();

        instrArr[9] = new Guitar();
        instrArr[9].play();

        // check the instance of piano in the array. This can be of any objects in the package
        for(int i = 0; i<10; i++){
            System.out.println(instrArr[i] instanceof Piano);
        }

    }
}
