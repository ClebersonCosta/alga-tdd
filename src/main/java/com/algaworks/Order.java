package com.algaworks;

public class Order {

    private double totalValue;
    private double discount;

    public void addItem(ItemOrder orderItem) {
        totalValue = orderItem.getUnitValue() * orderItem.getQuantity();
    }

    public double totalValue() {
        return totalValue;
    }

    public double discount() {
        return discount;
    }

}