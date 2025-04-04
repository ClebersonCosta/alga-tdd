package com.algaworks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private Order order;

    private void assertOrderSummary(double totalValue, double discount) {
        OrderSummary orderSummary = order.summary();
        assertEquals(totalValue, orderSummary.getTotalValue(), 0.001);
        assertEquals(discount, orderSummary.getDiscount(), 0.001);
    }

    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void shouldAllowAddItemToOrder() {
        order.addItem(new OrderItem("Soap", 3d, 10));
    }

    @Test
    void shouldCalculateTotalValueForEmptyOrder() {
        assertEquals(0d, 0d);
    }

    @Test
    void shouldCalculateTotalValueAndDiscountForEmptyOrder() {
        assertOrderSummary(0d, 0d);
    }

    @Test
    void shouldCalculateSummaryForOneItemWithoutDiscount() {
        order.addItem(new OrderItem("Soap", 5d, 5));
        assertOrderSummary(25d, 0d);
    }

    @Test
    void shouldCalculateSummaryForTwoItemWithoutDiscount() {
        order.addItem(new OrderItem("Soap",3d,3));
        order.addItem(new OrderItem("Toothpaste", 7d, 3));

        assertOrderSummary(30d,0d);
    }

    @Test
    void shouldApplyDiscountInTheFirstRule() {
        order.addItem(new OrderItem("Cream", 20d, 20));
        assertOrderSummary(400d, 16d);
    }

    @Test
    void shouldApplyDiscountInTheSecondRule() {
        order.addItem(new OrderItem("Shampoo", 15d, 30));
        order.addItem(new OrderItem("Body Oil", 15d, 30));

        assertOrderSummary(900d, 54d);
    }

    @Test
    void shouldApplyDiscountInTheThirdRule() {
        order.addItem(new OrderItem("Cream", 20d, 20));
        order.addItem(new OrderItem("Shampoo", 15d, 30));
        order.addItem(new OrderItem("Body Oil", 15d, 30));

        assertOrderSummary(1300d, 104d);
    }

}