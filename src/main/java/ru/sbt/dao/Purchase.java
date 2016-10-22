package ru.sbt.dao;

import java.util.Date;

public class Purchase {
    private final long id;
    private final Date date;
    private final double cost;
    private final String shop;

    public Purchase(long id, Date date, double cost, String shop) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.shop = shop;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }

    public String getShop() {
        return shop;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", date=" + date +
                ", cost=" + cost +
                ", shop='" + shop + '\'' +
                '}';
    }
}
