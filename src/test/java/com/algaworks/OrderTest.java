package com.algaworks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    private Order order;

    private void assertOrderSummary(double unitValue, double discount) {
        assertEquals(unitValue, order.totalValue(), 0.001);
        assertEquals(discount, order.discount(), 0.001);
    }

    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void shouldAllowAddItemToOrder() {
        order.addItem(new ItemOrder("Soap", 3d, 10));
    }

    @Test
    void shouldCalculateTotalValueForEmptyOrder() {
        assertEquals(0.0, order.totalValue());
    }

    @Test
    void shouldCalculateTotalValueAndDiscountForEmptyOrder() {
        assertOrderSummary(0d, 0d);
    }

    @Test
    void shouldCalculateSummaryForOneItemWithoutDiscount() {
        order.addItem(new ItemOrder("Soap", 5d, 5));
        assertOrderSummary(25d, 0d);
    }

}