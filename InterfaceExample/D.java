package InterfaceExample;

public class D implements B, C{
    public void foo(){
        B.super.foo();
        C.super.foo();
    }
}
