package abstractexample.CarInheritanceExample;

public class SportCar extends Car{
    boolean airBalloonType = false;
    public void display(){
        super.display();
        System.out.println("The balloon type: " + airBalloonType);
    }

}
