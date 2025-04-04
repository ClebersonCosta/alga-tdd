package com.algaworks.discount;

public class ThirdRuleDiscountCalculator extends DiscountRuleCalculator {

    public ThirdRuleDiscountCalculator(DiscountRuleCalculator next) {
        super(next);
    }

    @Override
    protected double calculate(double totalValue) {
        if (totalValue > 1000)
            return totalValue * 0.08;

        return -1;
    }

}