package com.algaworks.discount;

public class NoDiscount extends DiscountRuleCalculator {

    public NoDiscount(DiscountRuleCalculator next) {
        super(next);
    }

    @Override
    protected double calculate(double totalValue) {
        return 0;
    }

}