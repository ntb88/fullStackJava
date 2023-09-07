package InheritanceProblem;

public class GrandFather {
    int age;
    public GrandFather(int age){
        this.age = age;
    }

    public void showGrandAge(){
        System.out.println("The grandfather age is: "+ age);
    }
}

class Father extends GrandFather{
    int age;
    public Father(int age){
        super(age + 30);
        this.age = age;
    }

    public void showFatherAge(){
        showGrandAge();
        System.out.println("The Father age is: "+ age);
    }
}

class Son extends Father{
    int age;
    public Son(int age){
        super(age + 30);
        this.age = age;
    }

    public void showSonAge(){
        showFatherAge();
        System.out.println("The Song age is: "+ age);
    }

}
