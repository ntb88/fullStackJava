import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 words: ");
        String[] arr = new String[5];
        for(int i = 0; i <arr.length; i++){
            if(sc.hasNext()){
                arr[i] = sc.next();
            }
        }

        System.out.println("This is your array: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+", ");
        }


        // reverse each word
        StringBuffer[] reversed = new StringBuffer[5];
        for(int i = 0; i< arr.length; i++){
            //get the first word
            StringBuffer sbf = new StringBuffer(arr[i]);
            reversed[i] = sbf.reverse();
        }

        System.out.println("This is your array: ");
        for(int i = 0; i <arr.length; i++){
            System.out.print(reversed[i]+", ");
        }

        //Alphabetical
        Arrays.sort(reversed);

        System.out.println(Arrays.toString(reversed));


    }
}
