package MethodOverLoadingProblem;

public class Main {
    public static void main(String[] args) {
        ShoppingPortal sp = new ShoppingPortal();
        sp.makePayment("16303161", "hjbdsfjkg");
        sp.makePayment(65110161, "jfbdfh");
        sp.makePayment(165455166, 2345, "fdgsglkb", "12/20/2012");
    }
}
