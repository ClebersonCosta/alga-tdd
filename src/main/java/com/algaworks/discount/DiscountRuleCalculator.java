package com.algaworks.discount;

public abstract class DiscountRuleCalculator {

    protected DiscountRuleCalculator next;

    public DiscountRuleCalculator(DiscountRuleCalculator next) {
        this.next = next;
    }

    public double discount(double totalValue) {
        double discount = calculate(totalValue);

         if (discount == -1)
             return next.discount(totalValue);

         return discount;
    }

    protected abstract double calculate(double totalValue);

}