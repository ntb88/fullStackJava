package abstractexample.CompartmentProblem;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compArray = new Compartment[10];


    Random rand = new Random();
    int choice = 0;

    for(int i=0;  i < 10; i++){

            choice = rand.nextInt(1, 5);
            System.out.println("The random number is " + choice);

             //assign specific compartment to specific array
            if (choice == 1 ){
                compArray[i] = new Ladies();
                compArray[i].notice();
            }else if(choice == 2){
                compArray[i] = new General();
                compArray[i].notice();
            }else if(choice == 3){
                compArray[i] = new FirstClass();
                compArray[i].notice();
            }else if (choice == 4){
                compArray[i] = new Luggage();
                compArray[i].notice();
            }
    }




    }
}
