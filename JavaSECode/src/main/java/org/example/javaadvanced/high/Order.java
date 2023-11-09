package org.example.javaadvanced.high;

import java.util.Objects;

/**
 * @ClassName: Order
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/9 20:40
 * @Description: TODO
 */
public class Order {
    private int orderId;
    private String orderName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
