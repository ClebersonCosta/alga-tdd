package com.algaworks;

import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    void shouldCreateOrder() {
        Order order = new Order();
    }

    @Test
    void shouldAllowAddItemToOrder() {
        Order order = new Order();
        order.addItem("Sabonete", 3.0, 10);
    }

}