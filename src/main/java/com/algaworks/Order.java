package com.algaworks;

import com.algaworks.discount.DiscountRuleCalculator;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final DiscountRuleCalculator calculator;
    private final List<OrderItem> orders = new ArrayList<>();

    public Order(DiscountRuleCalculator calculator) {
        this.calculator = calculator;
    }

    public void addItem(OrderItem orderItem) {
        orders.add(orderItem);
    }

    public OrderSummary summary() {
        double totalValue = orders.stream()
                .mapToDouble(i -> i.getUnitValue() * i.getQuantity())
                .sum();
        double discount = calculator.discount(totalValue);

        /*if (totalValue >= 300 && totalValue < 800) {
            discount = totalValue * 0.04;
        } else if (totalValue >= 800 && totalValue < 1000) {
            discount = totalValue * 0.06;
        } else if (totalValue >= 1000) {
            discount = totalValue * 0.08;
        }*/

        return new OrderSummary(totalValue, discount);
    }

}