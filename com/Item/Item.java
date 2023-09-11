package com.Item;

public class Item {
    int itemId;
    String itemName;

    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public void printDetails(){
        System.out.println("Item id: "+ itemId + " & Item name: "+ itemName);
    }
}
