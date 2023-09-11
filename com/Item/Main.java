package com.Item;

import java.util.ArrayList;


public class Main extends Thread{

    public static void main(String[] args)  {
        ArrayList<Item> itemList = new ArrayList<>();

        //Thread 1 - Write items into Array list
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (itemList){
                    for(int i = 0; i<5; i++){
                        itemList.add(new Item(i, "Item"+i));
                    }
                }
                System.out.println("Writing completed!");
            }
        };

        //Thread 2 - Read item details from the Array list
        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (itemList){
                    for(int i = 0; i<5; i++){
                        itemList.get(i).printDetails();
                    }
                }
                System.out.println("Reading details completed!");
            }

        };


        //Start threads
        t1.start();
        t2.start();

    }
}
