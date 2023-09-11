package Threads;

public class SingleThreaded {
    public static void main(String[] args) {
        SingleThreaded st = new SingleThreaded();
        st.printNumbers();

        for (int j=0; j<100; j++){
            System.out.println("j: " + j);
        }
    }

    void printNumbers(){
        for (int i=0; i<100; i++){
            System.out.println("i: " + i);
        }
    }
}
