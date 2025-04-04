package com.algaworks.discount;

public class SecondRuleDiscountCalculator extends DiscountRuleCalculator {

    public SecondRuleDiscountCalculator(DiscountRuleCalculator next) {
        super(next);
    }

    @Override
    protected double calculate(double totalValue) {
        if (totalValue > 800 && totalValue <= 1000)
            return totalValue * 0.06;

        return -1;
    }
}
