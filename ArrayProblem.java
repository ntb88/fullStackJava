import java.util.Scanner;

public class ArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a size of the array you wish to create : ");
        int arr_size = sc.nextInt();

        int[] a = new int[arr_size];

        System.out.print("Please enter a the elements of the array you wish to create  : ");
        for(int i = 0; i <arr_size; i++){
            if(sc.hasNextInt()){
                a[i] = sc.nextInt();
            }
        }

        System.out.print("The array is ");
        for (int i = 0; i < arr_size; i++){
            System.out.println(a[i] + ", ") ;
        }

        // The sum of the array
        int sum = 0;
        System.out.print ("The sum of the array is ");
        for (int i = 0; i < arr_size; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);

        // The average of the array
        double avg = 0;
        avg = sum / arr_size;
        System.out.print("The sum of the array is " + avg);

    }
}
