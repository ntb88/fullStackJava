package abstractexample.CarInheritanceExample;

public class Car {
     int speed;
     int noOfGear;

     public void drive(int speed, int noOfGear){
         this.noOfGear = noOfGear;
         this.speed = speed;
     }
     public void display(){
         System.out.println("The starting speed is: " + speed +"\nNumber of gears: "+ noOfGear);
     }

}
