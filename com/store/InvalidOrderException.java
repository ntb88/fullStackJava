package com.store;

public class InvalidOrderException extends Exception{

    public InvalidOrderException() {
        super();
        System.out.println("Order amount cannot be less than 100 & payment option cannot be other than the listed choice!");
    }
}
