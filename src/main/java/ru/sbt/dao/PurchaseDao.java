package ru.sbt.dao;

import java.util.Date;
import java.util.List;

public interface PurchaseDao {
    void save(Purchase purchase);

    List<Purchase> find(Date date);
}
