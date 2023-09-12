package com.store;

import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {

        //testing Order class
        //Order or = new Order(id, name, amt, choice );
        System.out.println("Enter 1st order details: ");
        Order or1 = TestClient.constructOrder();
        System.out.println("Enter second st order details: ");
        Order or2 = TestClient.constructOrder();
        //System.out.println("Enter Third order details: ");
        //Order or3 = TestClient.constructOrder();


        // create the tree map with Order objects
        OrderServiceUtil ors = new OrderServiceUtil();
        ors.addOrder(or1);
        ors.addOrder(or2);
        //ors.addOrder(or3);


        for (Integer key : ors.orderMap.keySet()){
            System.out.println(ors.orderMap.get(key));
        }
        //perform operations on orderserviceutil
        ors.searchOrder("2").toString();
        ors.findTotal();

    }





    public static Order constructOrder(){
        Scanner sc = new Scanner(System.in);
        int id;
        float amt=0;
        String option = "";
        String name;
        Order o = null;

        // order amount
        System.out.println("Please enter an order amount: ");
        try{
            amt = sc.nextInt();
            if(amt < 100){
                throw new InvalidOrderException();
            }
        }catch (InvalidOrderException e) {
            while(amt < 100){
                System.out.println("Please enter an Order Amount: ");
                amt = sc.nextInt();
            }
        }

        // order option
        int n = 0;
        boolean flag = false;
        while(flag != true){
            try{
                System.out.println("Please enter a number corresponding to your option: ");
                System.out.println("1. CoD");
                System.out.println("2. Gift Card");
                System.out.println("3. Internet Banking");
                n = sc.nextInt();

                if (n == 1){
                    option = "CoD";
                    flag = true;
                } else if(n == 2) {
                    option= "Gift Card";
                    flag = true;
                } else if ( n == 3){
                    option = "Internet Banking";
                    flag = true;
                } else {
                    throw new InvalidOrderException();
                }
            }catch (InvalidOrderException ex) {
                flag = false;
            }
        }

        //oder id
        System.out.println("Please enter an order id: ");
        id = sc.nextInt();
        //customer name
        System.out.println("Please enter a customer name : ");
        name = sc.next();

        o = new Order(id, name, amt, option);
        return o;

    }

}
