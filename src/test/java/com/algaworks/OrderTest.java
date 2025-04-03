package com.algaworks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {

    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void shouldAllowAddItemToOrder() {
        order.addItem("Soap", 3.0, 10);
    }

}