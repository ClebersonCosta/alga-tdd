package com.algaworks;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<OrderItem> orders = new ArrayList<>();

    public void addItem(OrderItem orderItem) {
        orders.add(orderItem);
    }

    public OrderSummary summary() {
        double discount = 0;
        double totalValue = orders.stream()
                .mapToDouble(i -> i.getUnitValue() * i.getQuantity())
                .sum();

        if (totalValue >= 300 && totalValue < 800) {
            discount = totalValue * 0.04;
        } else if (totalValue >= 800 && totalValue < 1000) {
            discount = totalValue * 0.06;
        } else if (totalValue >= 1000) {
            discount = totalValue * 0.08;
        }

        return new OrderSummary(totalValue, discount);
    }

}