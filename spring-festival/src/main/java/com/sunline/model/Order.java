package com.sunline.model;

public class Order {

    private String orderid;
    private String ordernum;

    public Order(String orderid, String ordernum) {
        this.orderid = orderid;
        this.ordernum = ordernum;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", ordernum='" + ordernum + '\'' +
                '}';
    }
}
