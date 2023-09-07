package abstractexample.MedicineExample;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine medArray[] = new Medicine[10];

        Random rand = new Random();


        for(int i=0;  i < 10; i++){

            int choice = rand.nextInt(1, 4);
            System.out.println("The random number is " + choice);

            //assign specific compartment to specific array
            if (choice == 1 ){
                medArray[i] = new Tablet();
                medArray[i].displayLabel();
            }else if(choice == 2){
                medArray[i] = new Syrup();
                medArray[i].displayLabel();
            }else if(choice == 3){
                medArray[i] = new Ointment();
                medArray[i].displayLabel();
            }
        }
    }

}
