package com.algaworks;

import java.util.Objects;

public class ItemOrder {

    private String description;
    private double unitValue;
    private double quantity;

    public ItemOrder() {
            }

    public ItemOrder(String description, double unitValue, double quantity) {
        this.description = description;
        this.unitValue = unitValue;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemOrder orderItem = (ItemOrder) o;
        return Double.compare(unitValue, orderItem.unitValue) == 0 && Double.compare(quantity, orderItem.quantity) == 0 && Objects.equals(description, orderItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, unitValue, quantity);
    }

}
