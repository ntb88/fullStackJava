package com.store;

import java.util.Map;
import java.util.TreeMap;

public class OrderServiceUtil {

    Map<Integer, Order> orderMap = new TreeMap();
    public void addOrder(Order o1) {
        orderMap.put(o1.getOrderId(), o1);
    }


    public Order searchOrder(String orderId){
        System.out.println("The search result is ");
        int id = Integer.parseInt(orderId);
        System.out.println(orderMap.get(id).toString());
        return  orderMap.get(id);
    }


    float total;
    public float findTotal(){
        for (Integer key : orderMap.keySet()){
            total+=orderMap.get(key).getOrderAmount();
        }
        System.out.print("The total order amount is : " + total);
        return total;
    };

}
