import java.util.Scanner;

public class BINGO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number a between 1 and 50");
        int num = sc.nextInt();

        int[] arr = {2, 4, 11, 44, 50};

        for(int i=0;i<arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("BINGO");
            }
        }
    }
}
