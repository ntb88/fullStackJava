package MethodOverLoadingProblem;

public class ShoppingPortal {
    public void makePayment(String username, String password){
        System.out.println("Payment made using banking system");
    }
    public void makePayment(int cc, int cvv, String name, String date){
        System.out.println("Credit/Debit payment");
    }
    public void makePayment(long mobilenum, String password){
        System.out.println("Mobile payment");
    }
}
