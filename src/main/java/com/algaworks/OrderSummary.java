package com.algaworks;

import java.util.Objects;

public class OrderSummary {

    private double totalValue;
    private double discount;

    public OrderSummary() {}

    public OrderSummary(double totalValue, double discount) {
        this.totalValue = totalValue;
        this.discount = discount;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderSummary that = (OrderSummary) o;
        return Double.compare(totalValue, that.totalValue) == 0 && Double.compare(discount, that.discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalValue, discount);
    }

}