package InterfaceExample;

 interface A {
    default void foo(){
        System.out.println("A's foo");
    }
}

 interface B extends A{
    default void foo(){
        System.out.println("B's foo!");
    }
}

interface C extends A{
    default void foo(){
        System.out.println("c's foo!");
    }
}




