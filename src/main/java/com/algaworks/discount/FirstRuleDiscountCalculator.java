package com.algaworks.discount;

public class FirstRuleDiscountCalculator extends DiscountRuleCalculator {

    public FirstRuleDiscountCalculator(DiscountRuleCalculator next) {
        super(next);
    }

    @Override
    protected double calculate(double totalValue) {
        if (totalValue > 300 && totalValue <= 800)
            return totalValue * 0.04;

        return -1;
    }

}