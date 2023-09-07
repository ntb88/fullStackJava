package MethodOverRidingProblem;

public class OverridingDemo {
    public static void main(String[] args) {
        Parent p = new Child(); // child is the object created and is stored in a parent variable p
        p.buildingConstruction();

        Parent p1 = new Parent();
        p1.buildingConstruction();
    }
}
