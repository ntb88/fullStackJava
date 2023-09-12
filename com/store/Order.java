package com.store;

public class Order {
    private int orderId;
    private String customerName;
    private float orderAmount;
    private String paymentOption;

    public Order(int orderId, String customerName, float orderAmount, String paymentOption) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.paymentOption = paymentOption;
    }

    public int getOrderId() {
        return orderId;
    }

    public float getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", orderAmount=" + orderAmount +
                ", paymentOption='" + paymentOption + '\'' +
                '}';
    }
}
